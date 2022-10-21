package tn.esprit.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.spring.Entities.Contrat;

import java.util.List;

public class ContratService implements IContratService{
    @Autowired


    @Override
    public Contrat addContrat(Contrat d) {
        return null;
    }

    @Override
    public List<Contrat> addContrat(List<Contrat> listContrat) {
        return null;
    }

    @Override
    public Contrat updateContrat(Contrat d) {
        return null;
    }

    @Override
    public List<Contrat> updateContrat(List<Contrat> listContrat) {
        return null;
    }

    @Override
    public void deleteContrat(Long id) {

    }

    @Override
    public void deleteContrat(Contrat d) {

    }

    @Override
    public List<Contrat> findAllContrats() {
        return null;
    }

    @Override
    public Contrat findContratById(Long id) {
        return null;
    }
}
