package Javatown.persistence;

public interface ClientDao {
    long saveClient(String firstName, String lastName, String password, String city);
}
