
package com.portfolio.WG.Service;

import com.portfolio.WG.Entity.Experience;
import com.portfolio.WG.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ServiceExperience {
    @Autowired IExperienciaRepository iExperienceRep;
    
    public List<Experience> list(){
        return iExperienceRep.findAll();
    }
    
    public Optional<Experience> getOne(int id){
        return iExperienceRep.findById(id);
    }
    
     public Optional<Experience> getByName(String name){
         return iExperienceRep.findByName(name);
     }
    
    public void save(Experience exp){
        iExperienceRep.save(exp);
    }
    
    public void delete(int id){
        iExperienceRep.deleteById(id);
    }
    
    public boolean existById(int id){
        return iExperienceRep.existsById(id);
    }
    
    public boolean existsByName(String name){
         return iExperienceRep.existsByName(name);
     }

}
