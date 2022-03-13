package Javatown.service;

import Javatown.persistence.AdminDao;

public class AdminService {
    private AdminDao dao;
    public AdminService(AdminDao dao) {
        this.dao = dao;
    }
}
