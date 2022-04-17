 package ru.geekbrains.controller.Dto;

 import lombok.Data;

 import java.time.LocalDateTime;

 @Data
 public class OrderDto {

    private Long id;

    public OrderDto() {
    }

    public OrderDto(Long id) {
        this.id = id;
    }

     public <R> OrderDto(Long id, LocalDateTime orderDate, String name, String username, R collect) {
     }

     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
