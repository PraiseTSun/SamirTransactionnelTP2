package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
public class Debt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    private Date dateOfDebt;
//    @ManyToOne
//    @JoinColumn(name = "fk_client")
//    @ToString.Exclude
//    private Client client;

    public Debt(Client client, String dateOfDebt) {
        this.dateOfDebt = Date.valueOf(dateOfDebt);
    }

    public long getId() {
        return id;
    }
}
