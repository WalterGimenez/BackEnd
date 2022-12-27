
package com.portfolio.WG.Controller;

import com.portfolio.WG.Dto.DtoProyect;
import com.portfolio.WG.Entity.Proyect;
import com.portfolio.WG.Security.Controller.Message;
import com.portfolio.WG.Service.ServiceProyect;
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
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://front-wgimenez.web.app")
@RequestMapping("/proyect")
public class ProyectController {
    @Autowired ServiceProyect serviceProyect;
    
    @GetMapping("/list")
    public ResponseEntity<List<Proyect>> list(){
        List<Proyect> list = serviceProyect.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyect> getById(@PathVariable("id")int id){
        if(!serviceProyect.existsById(id)){
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.BAD_REQUEST);
        }
        
        Proyect proyect = serviceProyect.getOne(id).get();
        return new ResponseEntity(proyect, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoProyect dtoProyect){
        if(StringUtils.isBlank(dtoProyect.getName())){
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if(serviceProyect.existsByName(dtoProyect.getName())){
            return new ResponseEntity(new Message("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        
        Proyect proyect = new Proyect(
                dtoProyect.getLink(),dtoProyect.getName(),dtoProyect.getDescrip(),dtoProyect.getLinkproy()
            );
        serviceProyect.save(proyect);
        return new ResponseEntity(new Message("Proyecto creado"), HttpStatus.OK);
                
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoProyect dtoProyect){
        if(!serviceProyect.existsById(id)){
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if(serviceProyect.existsByName(dtoProyect.getName()) && serviceProyect.getByName(dtoProyect.getName()).get().getId() != id){
            return new ResponseEntity(new Message("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if(StringUtils.isBlank(dtoProyect.getName())){
            return new ResponseEntity(new Message("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }
        
        if(StringUtils.isBlank(dtoProyect.getDescrip())){
            return new ResponseEntity(new Message("El campo Descripción no debe estar vacío"),HttpStatus.BAD_REQUEST);
        }
        
         if(StringUtils.isBlank(dtoProyect.getLinkproy())){
            return new ResponseEntity(new Message("El campo  no debe estar vacío"),HttpStatus.BAD_REQUEST);
        }
        
        Proyect proyect = serviceProyect.getOne(id).get();
        
        proyect.setLink(dtoProyect.getLink());
        proyect.setName(dtoProyect.getName());
        proyect.setDescrip(dtoProyect.getDescrip());
        proyect.setLinkproy(dtoProyect.getLinkproy());
        
        serviceProyect.save(proyect);
        
        return new ResponseEntity(new Message("Proyecto actualizado"), HttpStatus.OK);
    }
    
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!serviceProyect.existsById(id)){
            return new ResponseEntity(new Message("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        serviceProyect.delete(id);
        return new ResponseEntity(new Message("Proyecto eliminado"), HttpStatus.OK);
    }
}
