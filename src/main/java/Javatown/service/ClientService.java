package Javatown.service;

import Javatown.modele.Client;
import Javatown.persistence.ClientDao;

public class ClientService {
    private ClientDao dao;
    public ClientService(ClientDao dao) {
        this.dao = dao;
    }

    public long createClient(String firstName, String lastName, String password, String city) {
        return dao.saveClient(firstName, lastName, password, city);
    }

    public Client getClientByPassword(String firstName, String lastName, String password) {
        return dao.findClientByPassword(firstName, lastName, password);
    }
}
