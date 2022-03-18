package ru.geekbrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.controller.Dto.ProductDto;
import ru.geekbrains.service.ProductService;

import java.util.Optional;

@RequestMapping("/v1/product")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/all")
    public Page<ProductDto> findAll(@RequestParam("categoryId")Optional<Long> categoryId,
                                    @RequestParam("namePattern")Optional<String> namePattern,
                                    @RequestParam("page")Optional<Integer> page,
                                    @RequestParam("size")Optional<Integer> size,
                                    @RequestParam("sortField")Optional<String> sortField){
        return productService.findAll(
                categoryId,
                namePattern,
                page.orElse(1) - 1,
                size.orElse(5),
                sortField.filter(fld -> !fld.isBlank()).orElse("id"));

    }
}
