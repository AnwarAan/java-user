package user.javauser.model;

import java.time.LocalDateTime;

import io.github.resilience4j.core.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NonNull
  private Long id;
  @NonNull
  private String name;
  private String username;
  @NonNull
  @Column(unique = true)
  private String email;
  @NonNull
  private String password;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

}
