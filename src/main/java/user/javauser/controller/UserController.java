package user.javauser.controller;

import java.security.Principal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.javauser.service.UserService;
import user.javauser.utils.ChangePasswordRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @PatchMapping
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest request, Principal connectedUser) {
        userService.changePassowrd(request, connectedUser);
        return ResponseEntity.ok().build();
    }
}
