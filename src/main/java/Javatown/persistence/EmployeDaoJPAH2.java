package Javatown.persistence;

import Javatown.modele.Book;
import Javatown.modele.Employe;

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
}
