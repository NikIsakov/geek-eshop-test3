package ru.geekbrains.service;


import ru.geekbrains.controller.Dto.OrderDto;

import java.util.List;

public interface OrderService {

    List<OrderDto> findOrdersByUsername(String username);

    void createOrder(String username);
}
