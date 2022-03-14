package Javatown.service;

import Javatown.modele.Administrator;
import Javatown.modele.Debt;
import Javatown.modele.Loan;
import Javatown.persistence.AdminDao;

import java.util.List;

public class AdminService {
    private AdminDao dao;
    public AdminService(AdminDao dao) {
        this.dao = dao;
    }

    public long createAdmin(String firstName, String lastName, String password) {
        return dao.saveAdmin(firstName, lastName, password);
    }

    public Administrator getAdminByPassword(String firstName, String lastName, String password) {
        return dao.findAdminByPassword(firstName, lastName, password);
    }

    public List<Loan> getLoansOfMonth(String month) {
        return dao.findLoansOfMonth(month);
    }

    public List<Debt> getDebtsOfMonth(String month) {
        return dao.findDebtsOfMonth(month);
    }
}
