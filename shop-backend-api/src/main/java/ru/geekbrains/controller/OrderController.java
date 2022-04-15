package ru.geekbrains.controller;

import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@PreAuthorize("isAuthenticated()")
@RequestMapping("/v1/order")
@RestController
public class OrderController {

    @GetMapping
    public List<SpringDataJaxb.OrderDto> findAll() {
        return Collections.emptyList();
    }
}
