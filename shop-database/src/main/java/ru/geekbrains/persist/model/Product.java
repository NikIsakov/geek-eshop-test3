package ru.geekbrains.persist.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column(length = 65535, columnDefinition = "LONGTEXT")
    private String description;

    @Column
    private Integer price;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @ManyToOne(optional = false)
    private Category category;

    @OneToMany(mappedBy = "product",
            orphanRemoval = true,
            cascade = CascadeType.ALL)
    private List<Picture> pictures = new ArrayList<>();

    public Product(Long id, String title, String description, Integer price, Category category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }


}
