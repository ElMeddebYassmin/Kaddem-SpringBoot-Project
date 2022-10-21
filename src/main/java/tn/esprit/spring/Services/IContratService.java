package tn.esprit.spring.Services;

import tn.esprit.spring.Entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat d);
    List<Contrat> addContrat (List<Contrat> listContrat);

    Contrat updateContrat (Contrat d);
    List<Contrat> updateContrat (List<Contrat> listContrat);

    void deleteContrat(Long id);
    void deleteContrat(Contrat d);

    List<Contrat> findAllContrats();
    Contrat findContratById (Long id);
}
