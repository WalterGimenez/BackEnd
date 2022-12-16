
package com.portfolio.WG.Controller;

import com.portfolio.WG.Dto.DtoExperience;
import com.portfolio.WG.Entity.Experience;
import com.portfolio.WG.Security.Controller.Message;
import com.portfolio.WG.Service.ServiceExperience;
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
@RequestMapping("/exper")
public class ExperienceController {
    @Autowired ServiceExperience serviceExperience;
    
    @GetMapping("/list")
    public ResponseEntity<List<Experience>> list(){
        List<Experience> list = serviceExperience.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
     @GetMapping("/detail/{id}")
    public ResponseEntity<Experience> getById(@PathVariable("id") int id){
        if(!serviceExperience.existById(id))
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.NOT_FOUND);
        Experience experiencia = serviceExperience.getOne(id).get();
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoExperience dtoExp){
        if(StringUtils.isAllBlank(dtoExp.getName()))
            return new ResponseEntity(new Message("El campo nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(serviceExperience.existsByName(dtoExp.getName()))
            return new ResponseEntity(new Message("Ya existe esa experiencia"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isAllBlank(dtoExp.getStartend()))
            return new ResponseEntity(new Message("El campo año es obligatorio"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isAllBlank(dtoExp.getLink()))
            return new ResponseEntity(new Message("El campo link  es obligatorio"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isAllBlank(dtoExp.getJob()))
             return new ResponseEntity(new Message("El campo trabajo es obligatorio"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isAllBlank(dtoExp.getDescrip()))
             return new ResponseEntity(new Message("El campo descripción es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experience experience = new Experience(dtoExp.getName(),dtoExp.getStartend(),dtoExp.getLink(),dtoExp.getJob(),dtoExp.getDescrip());
        
        serviceExperience.save(experience);
        
        return new ResponseEntity(new Message("Experiencia agregada exitosamente"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoExperience dtoExp){
        if(!serviceExperience.existById(id))
            return new ResponseEntity(new Message("ID inexistente"), HttpStatus.BAD_REQUEST);
        
        if(serviceExperience.existsByName(dtoExp.getName()) && serviceExperience.getByName(dtoExp.getName()).get().getId() != id)
            return new ResponseEntity(new Message(" experiencia existente"), HttpStatus.BAD_REQUEST);
        
        if(StringUtils.isBlank(dtoExp.getName()))
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experience experience = serviceExperience.getOne(id).get();
        experience.setName(dtoExp.getName());
        experience.setStartend(dtoExp.getStartend());
        experience.setLink(dtoExp.getLink());
        experience.setJob(dtoExp.getJob());
        experience.setDescrip(dtoExp.getDescrip());
        
        serviceExperience.save(experience);
        return new ResponseEntity(new Message("Experiencia actualizada con éxito"), HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!serviceExperience.existById(id)) {
            return new ResponseEntity(new Message("no existe el id"), HttpStatus.NOT_FOUND);
        }
        serviceExperience.delete(id);
        return new ResponseEntity(new Message("Experiencia borrada exitosamente"), HttpStatus.OK);
    }
}
