package Javatown.persistence;

import Javatown.modele.*;

import java.lang.annotation.Documented;

public class EmployeDaoJPAH2 extends BaseDaoH2 implements EmployeDao {
    @Override
    public long saveEmploye(String firstName, String lastName, String password) {
        Employe employe = new Employe(firstName, lastName, password);
        save(employe);
        return employe.getId();
    }

    @Override
    public Employe findEmploye(String firstName, String lastName, String password) {
        return findByPassword(Employe.class, firstName, lastName, password);
    }

    @Override
    public long saveBook(String title, String author, String edithor, String year, int pages, String genre) {
        Book book = new Book(title, author, edithor, year, pages, genre);
        save(book);
        return book.getId();
    }

    @Override
    public long saveCD(String title, String author, String editor, String year, String genre) {
        CD cd = new CD(title, author, editor, year, genre);
        save(cd);
        return cd.getId();
    }

    @Override
    public long saveDVD(String title, String author, String editor, String year, String genre) {
        DVD dvd = new DVD(title, author, editor, year, genre);
        save(dvd);
        return dvd.getId();
    }

    @Override
    public long saveLoan(long clientId, long documentId, String dateOfLoan) {
        Client client = findById(Client.class, clientId);
        AbstractDocument document = findById(AbstractDocument.class, documentId);
        Loan loan = new Loan(client, document, dateOfLoan);
        save(loan);
        return loan.getId();
    }
}
