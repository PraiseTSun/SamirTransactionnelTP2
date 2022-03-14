package Javatown.persistence;

import Javatown.modele.AbstractDocument;
import Javatown.modele.Client;

import java.util.List;

public interface ClientDao {
    long saveClient(String firstName, String lastName, String password, String city);

    Client findClientByPassword(String firstName, String lastName, String password);

    List<AbstractDocument> findDocumentByTitle(String title);

    List<AbstractDocument> findDocumentsByAuthor(String author);

    List<AbstractDocument> findDocumentsByEditors(String editor);
}
