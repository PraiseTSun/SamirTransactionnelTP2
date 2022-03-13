package Javatown;

import Javatown.persistence.ClientDaoJPAH2;
import Javatown.service.ClientService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService(new ClientDaoJPAH2());
    }
}
