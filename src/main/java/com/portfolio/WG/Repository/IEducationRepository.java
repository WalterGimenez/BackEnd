
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducationRepository extends JpaRepository<Education, Integer>{
    public Optional<Education> findByName(String name);
    public boolean existsByName(String name);
}
