package user.javauser.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class PasswordEncoder {
    private static final int STRENGTH = 10;

    @SneakyThrows
    public String encode(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(STRENGTH);
        return passwordEncoder.encode(password);
    }

    public boolean mathces(String rawPassword, String hashedPassword) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(rawPassword, hashedPassword);
    }
}
