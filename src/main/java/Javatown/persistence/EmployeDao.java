package Javatown.persistence;

import Javatown.modele.Employe;

public interface EmployeDao {
    long saveEmploye(String firstName, String lastName, String password);

    Employe findEmploye(String firstName, String lastName, String password);
}
