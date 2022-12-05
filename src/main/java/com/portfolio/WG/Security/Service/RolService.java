
package com.portfolio.WG.Security.Service;
 
import com.portfolio.WG.Security.Entity.Rol;
import com.portfolio.WG.Security.Enums.RolName;
import com.portfolio.WG.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired IRolRepository iRolRepository;
    
    public Optional<Rol> findByRolName(RolName rolName){
        return iRolRepository.findByRolName(rolName);
    }
    
    public void saveRol(Rol rol){
        iRolRepository.save(rol);
    }
}
