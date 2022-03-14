package Javatown;

import Javatown.persistence.AdminDaoJPAH2;
import Javatown.persistence.ClientDaoJPAH2;
import Javatown.persistence.EmployeDaoJPAH2;
import Javatown.service.AdminService;
import Javatown.service.ClientService;
import Javatown.service.EmployeService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService(new ClientDaoJPAH2());
        EmployeService employeService = new EmployeService(new EmployeDaoJPAH2());
        AdminService adminService = new AdminService(new AdminDaoJPAH2());

        var clientId = clientService.createClient("Samir", "Badi", "PraiseTSun", "Javatown");
        var employeId = employeService.createEmploye("James", "Levesque", "test");
        var adminId = adminService.createAdmin("Dave", "Smith", "admin");

        var bookId = employeService.createBook("Atlas du Canada", "Bob", "Marley", "2005", 250, "Geographie");
        var cdId = employeService.createCD("Viking", "Amon Amarth", "Marvel", "2010", "Heavy Metal");
        var dvdId = employeService.createDVD("Avenger End Game", "Steve Lee", "Marvel", "2019", "Action");
        var loan1Id = employeService.createLoan(clientId, bookId, "2022-02-10");
        var loan2Id = employeService.createLoan(clientId, cdId, "2022-02-10");
        var loan3Id = employeService.createLoan(clientId, dvdId, "2022-02-10");
        var debt1Id = employeService.createDebt(clientId, "2022-03-04");


        System.out.println(clientService.getClientByPassword("Samir", "Badi", "PraiseTSun"));
        System.out.println(employeService.getEmployeByPassword("James", "Levesque", "test"));
        System.out.println(adminService.getAdminByPassword("Dave", "Smith", "admin"));
    }
}
