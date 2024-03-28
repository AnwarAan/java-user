package user.javauser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.javauser.model.User;
import user.javauser.repository.UserRepository;

@Service
public class UserService {

    @Autowired(required = true)
    private UserRepository userRepository;

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User register(User user) {
        return userRepository.save(user);
    }
}