package tn.esprit.spring.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;
    @Temporal(TemporalType.DATE)
    private Date dateDebutC;
    @Temporal(TemporalType.DATE)
    private Date dateFinC;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private boolean archive;
    private float montantC;
    //ManyToOne bidirectionnel -> génération de l'id dans la classe fille
    @ManyToOne
    private Etudiant etudiant;
}
