package ru.geekbrains.controller.Dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderLineItemDto {

    private Long id;

    private Long orderId;

    private Long productId;

    private String productName;

    private BigDecimal price;

    private Integer qty;

    private String color;

    private String material;

    public OrderLineItemDto() {
    }

    public OrderLineItemDto(Long id, Long orderId, Long productId, String productName, BigDecimal price, Integer qty, String color, String material) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
        this.color = color;
        this.material = material;
    }
}
