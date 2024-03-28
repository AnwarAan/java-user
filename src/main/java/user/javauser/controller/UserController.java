package user.javauser.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.javauser.model.User;
import user.javauser.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired(required = true)
    private UserService userService;

    // @GetMapping("/findAll")
    // public ResponseEntity<List<String>> findAll() {
    // return ResponseEntity.ok().body(userService.findAllUser());
    // }

    @GetMapping
    public List<User> getUsers() {
        return userService.findAllUser();
    }
}
