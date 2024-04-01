package user.javauser.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.javauser.util.PasswordEncoder;

import user.javauser.model.User;
import user.javauser.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    // PasswordEncoder passwordEncoder = new PasswordEncoder();

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        // user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

}