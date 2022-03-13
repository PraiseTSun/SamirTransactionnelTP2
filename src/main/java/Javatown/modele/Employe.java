package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Employe extends AbstractUser{
    public Employe(String firstName, String lastName, String password) {
        super(firstName, lastName, password);
    }
}
