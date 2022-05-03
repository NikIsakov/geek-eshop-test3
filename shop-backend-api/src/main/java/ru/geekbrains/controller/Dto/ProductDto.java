package ru.geekbrains.controller.Dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public class ProductDto implements Serializable {

    private Long id;

    private String title;

    private String description;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "type")
    @JsonSubTypes({ @JsonSubTypes.Type(name = "BIG_DECIMAL", value = BigDecimal.class) })
    private BigDecimal price;

    private CategoryDto category;

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
