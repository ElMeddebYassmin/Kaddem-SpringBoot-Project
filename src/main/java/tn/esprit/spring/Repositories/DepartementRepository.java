package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
}
