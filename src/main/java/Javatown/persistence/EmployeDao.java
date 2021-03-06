package Javatown.persistence;

import Javatown.modele.AbstractDocument;
import Javatown.modele.Employe;

public interface EmployeDao {
    long saveEmploye(String firstName, String lastName, String password);

    Employe findEmploye(String firstName, String lastName, String password);

    long saveBook(String title, String author, String edithor, String year, int pages, String genre);

    long saveCD(String title, String author, String editor, String year, String genre);

    long saveDVD(String title, String author, String editor, String year, String genre);

    long saveLoan(long clientId, long documentId, String dateOfLoan);

    AbstractDocument findDocumentById(long documentId);

    long saveDebt(long clientId, String dateOfReturn);
}
