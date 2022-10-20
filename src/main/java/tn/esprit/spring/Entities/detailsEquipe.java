package tn.esprit.spring.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class detailsEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailEquipe;
    private int salle;
    private String thematique;
    @OneToOne(mappedBy = "detailsEquipe")
    private Equipe equipe;
}
