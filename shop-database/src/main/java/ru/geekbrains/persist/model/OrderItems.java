package ru.geekbrains.persist.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "orderitems")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column
    private String product;

    @Column
    private int count;

//    @ManyToMany
//    @JoinTable(
//            name = "product_orderItems",
//            joinColumns = @JoinColumn(name = "orderItems_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id")
//    )
//    private List<Product> products;

//    @OneToOne(mappedBy = "order")
//    Order order;
}
