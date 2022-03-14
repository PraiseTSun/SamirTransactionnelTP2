package Javatown.service;

import Javatown.modele.Administrator;
import Javatown.persistence.AdminDao;

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
}
