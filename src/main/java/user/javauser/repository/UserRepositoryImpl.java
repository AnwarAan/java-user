package user.javauser.repository;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import user.javauser.model.User;
import user.javauser.util.AbstractEntityManagerFactory;

public class UserRepositoryImpl extends AbstractEntityManagerFactory implements UserRepository {
    EntityManager entityManager = getEntityManager();

    public ResponseEntity<String> findAllUsers() {
        try {
            TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
            List<User> users = query.getResultList();
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(users);
            return ResponseEntity.ok(json);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error occurred while fetching users: " + e.getMessage());
        } finally {
            entityManager.close();
        }
    }

    @Override
    public User findUserOneUser() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void createUser() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteOneUser() {
        // TODO Auto-generated method stub

    }
}
