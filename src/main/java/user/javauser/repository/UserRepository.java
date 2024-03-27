package user.javauser.repository;

import org.springframework.http.ResponseEntity;

import user.javauser.model.User;

public interface UserRepository {
    // ResponseEntity<String> findAllUser();

    User findUserOneUser();

    void createUser();

    void deleteOneUser();

    // void deleteAllUser();
}
