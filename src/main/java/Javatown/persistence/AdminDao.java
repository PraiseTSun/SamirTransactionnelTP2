package Javatown.persistence;

import Javatown.modele.Administrator;
import Javatown.modele.Debt;
import Javatown.modele.Loan;

import java.util.List;

public interface AdminDao {
    long saveAdmin(String firstName, String lastName, String password);

    Administrator findAdminByPassword(String firstName, String lastName, String password);

    List<Loan> findLoansOfMonth(String month);

    List<Debt> findDebtsOfMonth(String month);
}
