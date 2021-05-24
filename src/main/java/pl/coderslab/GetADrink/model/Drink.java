package pl.coderslab.GetADrink.model;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean alcoholic;

    @ElementCollection
    private List<String> ingredients;

    @ElementCollection
    private List<String> measures;

    private String instructions;


}
