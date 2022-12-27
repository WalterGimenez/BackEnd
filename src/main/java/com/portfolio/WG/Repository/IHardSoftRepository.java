
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.Hardsoft;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHardSoftRepository extends JpaRepository<Hardsoft, Integer> {
    public Optional<Hardsoft> findByName(String name);
    public boolean existsByName(String name);
}
