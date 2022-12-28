
package com.portfolio.WG.Service;

import com.portfolio.WG.Entity.SoftHard;
import com.portfolio.WG.Repository.IHardSoftRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ServiceHardSoft {
    @Autowired IHardSoftRepository iHardSoftRepository;
    
    public List<SoftHard> list(){
        return iHardSoftRepository.findAll();
    }
    
    public Optional<SoftHard> getOne(int id){
        return iHardSoftRepository.findById(id);
    }
    
    public Optional<SoftHard> getByName(String name){
        return iHardSoftRepository.findByName(name);
    }
    
    public void save(SoftHard education){
        iHardSoftRepository.save(education);
    }
    
    public void delete(int id){
        iHardSoftRepository.deleteById(id);
    }
    
    public boolean existsById(int id){
        return iHardSoftRepository.existsById(id);
    }
    
    public boolean existsByName(String name){
        return iHardSoftRepository.existsByName(name);
    }
}
