
package com.portfolio.WG.Service;

import com.portfolio.WG.Entity.Proyect;
import com.portfolio.WG.Repository.IProyectRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceProyect {
    @Autowired IProyectRepository iproyectRepository;
    
    public List<Proyect> list(){
        return iproyectRepository.findAll();
    }
    
    public Optional<Proyect> getOne(int id){
        return iproyectRepository.findById(id);
    }
    
    public Optional<Proyect> getByName(String name){
        return iproyectRepository.findByName(name);
    }
    
    public void save(Proyect education){
        iproyectRepository.save(education);
    }
    
    public void delete(int id){
        iproyectRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iproyectRepository.existsById(id);
    }
    
    public boolean existsByName(String name){
        return iproyectRepository.existsByName(name);
    }
}
