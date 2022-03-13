package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Book extends AbstractDocument {
    public Book(String title, String author, String editor, String publicationYear, int nbPage, String genre) {
        super(title, author, editor, publicationYear, nbPage, genre);
    }

    @Override
    public int loanTimeInDay() {
        return 21;
    }
}
