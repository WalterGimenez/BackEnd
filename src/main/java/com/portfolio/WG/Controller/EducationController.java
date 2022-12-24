
package com.portfolio.WG.Controller;

import com.portfolio.WG.Dto.DtoEducation;
import com.portfolio.WG.Entity.Education;
import com.portfolio.WG.Security.Controller.Message;
import com.portfolio.WG.Service.ServiceEducation;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/education")
public class EducationController {
     @Autowired ServiceEducation serviceEducation;
    
    @GetMapping("/list")
    public ResponseEntity<List<Education>> list(){
        List<Education> list = serviceEducation.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Education> getById(@PathVariable("id")int id){
        if(!serviceEducation.existsById(id)){
            return new ResponseEntity(new Message("ID inexistente"), HttpStatus.NOT_FOUND);
        }
        
        Education education = serviceEducation.getOne(id).get();
        return new ResponseEntity(education, HttpStatus.OK);
    }
    
     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoEducation dtoEducation){
        if(StringUtils.isBlank(dtoEducation.getName())){
            return new ResponseEntity(new Message("El campo nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(serviceEducation.existsByName(dtoEducation.getName())){
            return new ResponseEntity(new Message("Nombre existente"), HttpStatus.BAD_REQUEST);
        }
        
        Education education = new Education(
                dtoEducation.getName(), dtoEducation.getStartend(),dtoEducation.getDescrip(), dtoEducation.getLink()
            );
        serviceEducation.save(education);
        return new ResponseEntity(new Message("Educación creada"), HttpStatus.OK);
                
    }
       
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoEducation dtoEducation){
        if(!serviceEducation.existsById(id)){
            return new ResponseEntity(new Message("ID inexistente"), HttpStatus.NOT_FOUND);
        }
        if(serviceEducation.existsByName(dtoEducation.getName()) && serviceEducation.getByName(dtoEducation.getName()).get().getId() != id){
            return new ResponseEntity(new Message("Nombre existente"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoEducation.getName())){
            return new ResponseEntity(new Message("Este campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        Education education = serviceEducation.getOne(id).get();
        
        education.setName(dtoEducation.getName());
        education.setStartend(dtoEducation.getStartend());
        education.setDescrip(dtoEducation.getDescrip());
        education.setLink(dtoEducation.getLink());
        serviceEducation.save(education);
        
        return new ResponseEntity(new Message("Educación actualizada"), HttpStatus.OK);
    }
    
    /*
    @PutMapping ("edit")
    public void editEducation(@RequestBody Education education){
        serviceEducation.save(education);
    }*/
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!serviceEducation.existsById(id)){
            return new ResponseEntity(new Message("ID inexistente"), HttpStatus.NOT_FOUND);
        }
        serviceEducation.delete(id);
        return new ResponseEntity(new Message("Educación eliminada"), HttpStatus.OK);
    }
    
   
}
