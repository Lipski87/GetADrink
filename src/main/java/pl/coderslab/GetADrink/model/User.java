package pl.coderslab.GetADrink.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Pole musi zostać wypełnione")
    @Size(min = 3, max = 15, message = "Nazwa użytkownika powinna mieć od 3 do 15 znaków")
    private String username;

    @NotNull(message = "Pole musi zostać wypełnione")
    @Min(value = 18, message = "Użytkownik musi mieć przynajmniej 18 lat")
    private int age;

    @NotNull(message = "Pole musi zostać wypełnione")
    @Email
    private String email;

    @NotNull(message = "Pole musi zostać wypełnione")
    private String password;

}
