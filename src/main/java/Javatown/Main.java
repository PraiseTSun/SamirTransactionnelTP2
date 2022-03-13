package Javatown;

import Javatown.persistence.ClientDaoJPAH2;
import Javatown.service.ClientService;
import Javatown.service.EmployeService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService(new ClientDaoJPAH2());
        EmployeService employeService = new EmployeService(new EmployeDaoJPAH2);
    }
}
