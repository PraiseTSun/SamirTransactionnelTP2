package Javatown.persistence;

public interface AdminDao {
    long saveAdmin(String firstName, String lastName, String password);
}
