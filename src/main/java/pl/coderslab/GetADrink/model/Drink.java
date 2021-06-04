package pl.coderslab.GetADrink.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "drinks")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String instructions;
    private String ingredientsAndMeasures;

    
}
