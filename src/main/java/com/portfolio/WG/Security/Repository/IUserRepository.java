
package com.portfolio.WG.Security.Repository;

import com.portfolio.WG.Security.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByUserName( String UserName);
    
    boolean existsByUserName(String UserName);
    boolean existsByEmail(String email);
}
