package Javatown.service;

import Javatown.persistence.ClientDao;

public class ClientService {
    private ClientDao dao;
    public ClientService(ClientDao dao) {
        this.dao = dao;
    }
}
