
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experience, Integer>{
    public Optional<Experience> findByName(String name);
    public boolean existsByName(String name);
}
