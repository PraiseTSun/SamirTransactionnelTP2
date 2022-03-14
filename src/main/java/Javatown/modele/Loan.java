package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @ToString.Exclude
    private Client client;

    @Basic
    private java.sql.Date dateOfLoan;
    @Basic
    private java.sql.Date dateOfReturn;

    //private Document document;
    public Loan(Client client, AbstractDocument document, String dateOfLoan) {
        this.client = client;
        this.dateOfLoan = java.sql.Date.valueOf(dateOfLoan);
        this.dateOfReturn = java.sql.Date.valueOf(returnDate(dateOfLoan, document.loanTimeInDay()));
    }

    private String returnDate(String date, int days) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = null;
        try {
            myDate = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        myDate = addDays(myDate, days);
        return format.format(myDate);
    }

    private Date addDays(Date myDate, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(myDate);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }
}
