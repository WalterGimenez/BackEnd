
package com.portfolio.WG.Repository;

import com.portfolio.WG.Entity.SoftHard;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHardSoftRepository extends JpaRepository<SoftHard, Integer> {
    public Optional<SoftHard> findByName(String name);
    public boolean existsByName(String name);
}
