package Javatown.persistence;

import Javatown.modele.Client;

public interface ClientDao {
    long saveClient(String firstName, String lastName, String password, String city);

    Client findClientByPassword(String firstName, String lastName, String password);
}
