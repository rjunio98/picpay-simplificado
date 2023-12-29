package robledo.junior.picpaysimplificado.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class User {

    private Long id;
    private String name;
    private String document;
    private String email;
    private String password;
    private UserType userType;
}
