
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.Education;
import java.util.Optional;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducationRepository {
    public Optional<Education> findByName(String name);
    public boolean existsByName(String name);
}
