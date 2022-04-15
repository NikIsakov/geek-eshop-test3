 package ru.geekbrains.controller.Dto;

public class OrderDto {

    private Long id;

    public OrderDto() {
    }

    public OrderDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
