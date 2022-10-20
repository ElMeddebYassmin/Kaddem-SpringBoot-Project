package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
