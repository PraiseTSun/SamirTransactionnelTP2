package Javatown.persistence;

import Javatown.modele.AbstractDocument;
import Javatown.modele.Client;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ClientDaoJPAH2 extends BaseDaoH2 implements ClientDao {
    @Override
    public long saveClient(String firstName, String lastName, String password, String city) {
        Client client = new Client(firstName, lastName, password, city);
        save(client);
        return client.getId();
    }

    @Override
    public Client findClientByPassword(String firstName, String lastName, String password) {
        return findByPassword(Client.class, firstName, lastName, password);
    }

    @Override
    public List<AbstractDocument> findDocumentByTitle(String title) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<AbstractDocument> query = em.createQuery(
                "select p from AbstractDocument p " +
                        "where p.title like '%" + title + "%'"
                , AbstractDocument.class);

        final List<AbstractDocument> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();
        return documents;
    }

    @Override
    public List<AbstractDocument> findDocumentsByAuthor(String author) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<AbstractDocument> query = em.createQuery(
                "select p from AbstractDocument p " +
                        "where p.author = :authorName"
                , AbstractDocument.class);
        query.setParameter("authorName", author);

        final List<AbstractDocument> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();
        return documents;
    }

    @Override
    public List<AbstractDocument> findDocumentsByEditors(String editor) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<AbstractDocument> query = em.createQuery(
                "select p from AbstractDocument p " +
                        "where p.editor = :editorName"
                , AbstractDocument.class);
        query.setParameter("editorName", editor);

        final List<AbstractDocument> documents = query.getResultList();

        em.getTransaction().commit();
        em.close();
        return documents;
    }
}
