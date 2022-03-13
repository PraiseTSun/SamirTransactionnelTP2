package Javatown.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
}
