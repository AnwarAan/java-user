package user.javauser.entity;

import io.github.resilience4j.core.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NonNull
  private Long id;
  @NonNull
  private String name;
  @NonNull
  private String email;
  @NonNull
  private String password;

  private String phoneNumber;
}
