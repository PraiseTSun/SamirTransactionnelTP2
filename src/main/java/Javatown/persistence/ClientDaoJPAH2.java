package Javatown.persistence;

import Javatown.modele.Client;

public class ClientDaoJPAH2 extends BaseDaoH2 implements ClientDao {
    @Override
    public long saveClient(String firstName, String lastName, String password, String city) {
        Client client = new Client(firstName, lastName, password, city);
        save(client);
        return client.getId();
    }
}
