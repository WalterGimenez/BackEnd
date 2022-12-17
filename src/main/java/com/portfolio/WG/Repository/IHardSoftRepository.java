
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.HardSoft;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHardSoftRepository extends JpaRepository<HardSoft, Integer> {
    public Optional<HardSoft> findByName(String name);
    public boolean existsByName(String name);
}
