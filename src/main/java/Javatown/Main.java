package Javatown;

import Javatown.persistence.ClientDaoJPAH2;
import Javatown.persistence.EmployeDaoJPAH2;
import Javatown.service.AdminService;
import Javatown.service.ClientService;
import Javatown.service.EmployeService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService(new ClientDaoJPAH2());
        EmployeService employeService = new EmployeService(new EmployeDaoJPAH2());
        AdminService adminService = new AdminService(new AdminDaoJPAH2);
    }
}
