package Javatown.persistence;

import Javatown.modele.Administrator;

public interface AdminDao {
    long saveAdmin(String firstName, String lastName, String password);

    Administrator findAdminByPassword(String firstName, String lastName, String password);
}
