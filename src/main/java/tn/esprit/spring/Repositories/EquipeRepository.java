package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.Entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
