package ru.geekbrains.persist.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(length = 65535, columnDefinition = "LONGTEXT")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @ManyToOne(optional = false)
    private Category category;

    @OneToMany(mappedBy = "product",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Picture> pictures = new ArrayList<>();

    public Product(Long id, String title, String description, BigDecimal price, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }


}
