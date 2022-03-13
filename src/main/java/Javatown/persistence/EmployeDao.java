package Javatown.persistence;

public interface EmployeDao {
    long saveEmploye(String firstName, String lastName, String password);
}
