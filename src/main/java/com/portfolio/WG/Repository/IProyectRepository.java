
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.Proyect;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectRepository extends JpaRepository<Proyect, Integer> {
    public Optional<Proyect> findByName(String name);
    public boolean existsByName(String name);
}
