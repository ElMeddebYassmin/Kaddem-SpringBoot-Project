package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
