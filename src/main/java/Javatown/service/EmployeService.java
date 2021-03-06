package Javatown.service;

import Javatown.modele.AbstractDocument;
import Javatown.modele.Employe;
import Javatown.persistence.EmployeDao;

public class EmployeService {
    private EmployeDao dao;
    public EmployeService(EmployeDao dao){
        this.dao = dao;
    }

    public long createEmploye(String firstName, String lastName, String password) {
        return dao.saveEmploye(firstName, lastName, password);
    }

    public Employe getEmployeByPassword(String firstName, String lastName, String password) {
        return dao.findEmploye(firstName, lastName, password);
    }

    public long createBook(String title, String author, String edithor, String year, int pages, String genre) {
        return dao.saveBook(title, author, edithor, year, pages, genre);
    }

    public long createCD(String title, String author, String editor, String year, String genre) {
        return dao.saveCD(title, author, editor, year, genre);
    }

    public long createDVD(String title, String author, String editor, String year, String genre) {
        return dao.saveDVD(title, author, editor, year, genre);
    }

    public long createLoan(long clientId, long documentId, String dateOfLoan) {
        return dao.saveLoan(clientId, documentId, dateOfLoan);
    }

    public long createDebt(long clientId, String dateOfReturn) {
        return dao.saveDebt(clientId, dateOfReturn);
    }

    public AbstractDocument getDocumentById(long documentId) {
        return dao.findDocumentById(documentId);
    }
}
