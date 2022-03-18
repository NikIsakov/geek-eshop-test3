package ru.geekbrains.controller.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ProductDto {

    private Long id;

    private String title;

    private String description;

    private BigDecimal price;

    private CategoryDto category;

    private MultipartFile[] newPicture;

    private List<Long> pictures;

    public ProductDto() {
    }

    public ProductDto(Long id, String title, String description, BigDecimal price,
                      CategoryDto category, List<Long> pictures) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.pictures = pictures;
    }

}
