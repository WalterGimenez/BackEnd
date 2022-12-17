
package com.portfolio.WG.Service;

import com.portfolio.WG.Entity.Education;
import com.portfolio.WG.Repository.IEducationRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ServiceEducation {
    @Autowired IEducationRepository iEducationRepository;
    
    public List<Education> list(){
        return iEducationRepository.findAll();
    }
    
    public Optional<Education> getOne(int id){
        return iEducationRepository.findById(id);
    }
    
    public Optional<Education> getByName(String name){
        return iEducationRepository.findByName(name);
    }
    
    public void save(Education education){
        iEducationRepository.save(education);
    }
    
    public void delete(int id){
        iEducationRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iEducationRepository.existsById(id);
    }
    
    public boolean existsByName(String name){
        return iEducationRepository.existsByName(name);
    }
}
