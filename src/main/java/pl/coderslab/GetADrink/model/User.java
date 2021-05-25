package pl.coderslab.GetADrink.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Set;

@Getter @Setter
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Size(min = 3, max = 15, message = "Nazwa użytkownika powinna mieć od 3 do 15 znaków")
    private String username;

//    @Min(value = 18, message = "Użytkownik musi mieć przynajmniej 18 lat")
//    private Integer age;
//
//    @Email
//    private String email;

    private String password;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

}
