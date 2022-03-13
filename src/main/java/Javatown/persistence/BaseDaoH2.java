package Javatown.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class BaseDaoH2 {
    protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("javatown.exe");

    protected <T> void save(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(t);

        em.getTransaction().commit();
        em.close();

    }

    protected <T> T findById(Class<T> t, long id){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        var u = (T) em.find(t, id);

        em.getTransaction().commit();
        em.close();
        return u;
    }

    protected <T> T findByPassword (Class<T> t, String firstName, String lastName, String password){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<T> query = em.createQuery(
                "select p from " + t.getName() + " p " +
                        "where p.firstName = :userFirstName AND p.lastName = :userLastName AND p.password = :userPassword"
                , t);
        query.setParameter("userFirstName", firstName);
        query.setParameter("userLastName", lastName);
        query.setParameter("userPassword", password);
        var u = (T) query.getSingleResult();

        em.getTransaction().commit();
        em.close();
        return u;
    }
}
