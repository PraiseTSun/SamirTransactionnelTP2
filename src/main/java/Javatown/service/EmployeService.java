package Javatown.service;

import Javatown.persistence.EmployeDao;

public class EmployeService {
    private EmployeDao dao;
    public EmployeService(EmployeDao dao){
        this.dao = dao;
    }
}
