package Javatown.service;

import Javatown.persistence.AdminDao;

public class AdminService {
    private AdminDao dao;
    public AdminService(AdminDao dao) {
        this.dao = dao;
    }

    public long createAdmin(String firstName, String lastName, String password) {
        return dao.saveAdmin(firstName, lastName, password);
    }
}
