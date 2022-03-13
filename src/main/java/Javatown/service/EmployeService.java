package Javatown.service;

public class EmployeService {
    private EmployeDao dao;
    public EmployeService(EmployeDao dao){
        this.dao = dao;
    }
}
