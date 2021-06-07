package pl.coderslab.GetADrink.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "drinks")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String alcoholic;
    private String ingredientsAndMeasures;
    private String instructions;

}
