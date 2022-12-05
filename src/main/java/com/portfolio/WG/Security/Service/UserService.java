
package com.portfolio.WG.Security.Service;

import com.portfolio.WG.Security.Entity.User;
import com.portfolio.WG.Security.Repository.IUserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired IUserRepository iUserRepository;
    
    public Optional<User> getByUserName(String userName){
        return iUserRepository.findByUserName(userName);
    }
    
    public boolean existByUserName(String userName){
        return iUserRepository.existsByUserName(userName);
    }
    
    public boolean existByEmail(String email){
        return iUserRepository.existsByEmail(email);
    }
    
    public void saveUser(User user){
        iUserRepository.save(user);
    }
}
