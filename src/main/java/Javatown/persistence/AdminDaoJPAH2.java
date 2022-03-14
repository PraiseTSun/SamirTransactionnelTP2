package Javatown.persistence;

import Javatown.modele.Administrator;

public class AdminDaoJPAH2 extends BaseDaoH2 implements AdminDao {
    @Override
    public long saveAdmin(String firstName, String lastName, String password) {
        Administrator admin = new Administrator(firstName, lastName, password);
        save(admin);
        return admin.getId();
    }

    @Override
    public Administrator findAdminByPassword(String firstName, String lastName, String password) {
        return findByPassword(Administrator.class, firstName, lastName, password);
    }
}
