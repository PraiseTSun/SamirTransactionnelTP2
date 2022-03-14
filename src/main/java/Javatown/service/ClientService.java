package Javatown.service;

import Javatown.modele.AbstractDocument;
import Javatown.modele.Client;
import Javatown.modele.Loan;
import Javatown.persistence.ClientDao;

import java.util.List;

public class ClientService {
    private ClientDao dao;
    public ClientService(ClientDao dao) {
        this.dao = dao;
    }

    public long createClient(String firstName, String lastName, String password, String city) {
        return dao.saveClient(firstName, lastName, password, city);
    }

    public Client getClientByPassword(String firstName, String lastName, String password) {
        return dao.findClientByPassword(firstName, lastName, password);
    }

    public List<AbstractDocument> getDocumentsByName(String title) {
        return dao.findDocumentByTitle(title);
    }

    public List<AbstractDocument> getDocumentsByAuthor(String author) {
        return dao.findDocumentsByAuthor(author);
    }

    public List<AbstractDocument> getDocumentsByEditor(String editor) {
        return dao.findDocumentsByEditors(editor);
    }

    public List<Loan> getloans(long clientId) {
        return dao.getLoans(clientId);
    }
}
