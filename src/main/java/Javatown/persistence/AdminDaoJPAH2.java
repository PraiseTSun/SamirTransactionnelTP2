package Javatown.persistence;

import Javatown.modele.Administrator;
import Javatown.modele.Debt;
import Javatown.modele.Loan;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AdminDaoJPAH2 extends BaseDaoH2 implements AdminDao {
    @Override
    public long saveAdmin(String firstName, String lastName, String password) {
        Administrator admin = new Administrator(firstName, lastName, password);
        save(admin);
        return admin.getId();
    }

    @Override
    public Administrator findAdminByPassword(String firstName, String lastName, String password) {
        return findByPassword(Administrator.class, firstName, lastName, password);
    }

    @Override
    public List<Loan> findLoansOfMonth(String month) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Loan> query = em.createQuery(
                "select p from Loan p where MONTHNAME(p.dateOfLoan) = :month"
                , Loan.class);
        query.setParameter("month", month);
        var resultList = query.getResultList();

        em.getTransaction().commit();
        em.close();
        return resultList;
    }

    @Override
    public List<Debt> findDebtsOfMonth(String month) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Debt> query = em.createQuery(
                "select p from Debt p where MONTHNAME(p.dateOfDebt) = :month"
                , Debt.class);
        query.setParameter("month", month);
        var resultList = query.getResultList();

        em.getTransaction().commit();
        em.close();
        return resultList;
    }
}
