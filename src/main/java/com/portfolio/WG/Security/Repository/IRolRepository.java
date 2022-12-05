
package com.portfolio.WG.Security.Repository;

import com.portfolio.WG.Security.Entity.Rol;
import com.portfolio.WG.Security.Enums.RolName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol , Integer>{
    Optional<Rol> findByRolName(RolName rolName);
}
