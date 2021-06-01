package net.noelli.network.springframework.sql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBManager {

    private EntityManager em;
    private EntityManagerFactory entityManagerFactory;

    public DBManager() {
        this.entityManagerFactory =
                Persistence.createEntityManagerFactory("net.xsupersungx.springframework");
        this.em = entityManagerFactory.createEntityManager();

    }

    public void beginTransaction() {
        em.getTransaction().begin();
    }

    public void commit() {
        em.getTransaction().commit();
    }

    public void persist(Object object) {
        em.persist(object);
    }

    public <T> T getInfo(Class<T> tClass, long id) {
        T t = em.find(tClass, id);
        em.detach(t);
        return t;
    }
    public void close() {
        entityManagerFactory.close();
        em.close();
    }
}
