package ru.geekbrains.controller.Dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto implements Serializable {

    private Long id;

    private String title;

    private String description;

    private Integer price;

    private CategoryDto category;

    private List<Long> pictures;

    public ProductDto() {
    }

    public ProductDto(Long id, String title, String description, Integer price,
                      CategoryDto category, List<Long> pictures) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.pictures = pictures;
    }

}
