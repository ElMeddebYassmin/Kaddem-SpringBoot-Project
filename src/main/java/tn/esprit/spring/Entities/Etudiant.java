package tn.esprit.spring.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Domaine domaine;
    /********************Association entre Contrat et Etudiant*/
    @OneToMany(mappedBy = "etudiant")
    private Set<Contrat> contrats;
    /********************Association entre Contrat et Equipe*/
    //ManyToMany bidirectionnel -> génération d'une table associative
    @ManyToMany(mappedBy = "etudiants")
    private Set<Equipe> equipes;
    /********************Association entre Contrat et Departement*/
    @ManyToOne
    private Departement departement;
}
