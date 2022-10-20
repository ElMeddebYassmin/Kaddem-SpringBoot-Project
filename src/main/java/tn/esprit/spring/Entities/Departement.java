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
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDepartement;
    private String nomDepartement;
    @OneToMany(mappedBy = "departement")
    private Set<Etudiant> etudiants;
}
