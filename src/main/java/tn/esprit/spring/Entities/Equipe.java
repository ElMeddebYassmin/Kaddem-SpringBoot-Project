package tn.esprit.spring.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEquipe;
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    //oneToOne bidirectionnel -> génération de l'id de la classe fille dans la classe mère
    @OneToOne
    private detailsEquipe detailsEquipe;
    @ManyToMany
    private Set<Etudiant> etudiants;
}
