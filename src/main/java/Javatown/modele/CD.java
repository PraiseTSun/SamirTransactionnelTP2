package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class CD extends AbstractDocument {
    public CD(String title, String author, String editor, String publicationYear, String genre) {
        super(title, author, editor, publicationYear, 0, genre);
    }

    @Override
    public int loanTimeInDay() {
        return 14;
    }
}
