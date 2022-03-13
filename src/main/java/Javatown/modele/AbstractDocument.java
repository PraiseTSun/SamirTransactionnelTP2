package Javatown.modele;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AbstractDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String author;
    private String editor;
    private Year publicationYear;
    private int nbPage;
    private String genre;
    private int nbExemplaire;

    public AbstractDocument(String title, String author, String editor, String publicationYear, int nbPage, String genre) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.publicationYear = Year.parse(publicationYear);
        this.nbPage = nbPage;
        this.genre = genre;
        nbExemplaire = 1;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public Year getPublicationYear() {
        return publicationYear;
    }

    public int getNbPage() {
        return nbPage;
    }

    public String getGenre() {
        return genre;
    }

    public abstract int loanTimeInDay();
}
