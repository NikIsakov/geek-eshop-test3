package ru.geekbrains.persist.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "countItem")
    private int countItem;

//    @OneToMany(mappedBy = "cart")
//    List<Product> products;
}
