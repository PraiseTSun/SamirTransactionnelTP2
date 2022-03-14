package Javatown.service;

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
}
