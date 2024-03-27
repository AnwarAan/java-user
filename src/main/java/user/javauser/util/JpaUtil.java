package user.javauser.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    public static final String PERSISTANCE_UNIT_NAME = "JPA";
    public static final EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory(PERSISTANCE_UNIT_NAME);

    protected EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public void closeEntityManager() {
        if (entityManagerFactory == null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
