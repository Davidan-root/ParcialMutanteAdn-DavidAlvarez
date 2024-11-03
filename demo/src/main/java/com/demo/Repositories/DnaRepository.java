package com.demo.Repositories;

import com.demo.Entities.DnaMutante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DnaRepository extends JpaRepository<DnaMutante, Long> {
    Optional<DnaMutante> findByDna(String dnaSequence);

    long countByIsMutant(boolean isMutant);
}
