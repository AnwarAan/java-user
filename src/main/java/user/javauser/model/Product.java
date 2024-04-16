package user.javauser.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    private Long id;
    private String name;
    private Long price;
    private String description;
    @Column(name = "image_url")
    private String imageUrl;
}
