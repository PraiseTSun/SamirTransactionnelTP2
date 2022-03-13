package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Administrator extends AbstractUser{
    public Administrator(String firstName, String lastName, String password) {
        super(firstName, lastName, password);
    }
}
