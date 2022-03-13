package Javatown.service;

public class ClientService {
    private ClientDao dao;
    public ClientService(ClientDao dao) {
        this.dao = dao;
    }
}
