package pl.coderslab.GetADrink.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "users_drinks")
    private Set<Drink> drinks = new HashSet<>();

}
