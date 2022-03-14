package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Client extends AbstractUser{
    private String resident;
    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Loan> loans;
//    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    private List<Debt> debts;

    public Client(String firstName, String lastName, String password, String resident) {
        super(firstName, lastName, password);
        this.resident = resident;
        this.loans = new ArrayList<>();
    }

    public boolean isReseidentOfJavatown(){
        return resident.equals("Javatows");
    }
}
