package user.javauser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import user.javauser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
