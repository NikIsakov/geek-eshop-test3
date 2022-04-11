package ru.geekbrains.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import ru.geekbrains.controller.Dto.ProductDto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class LineItem implements Serializable {

    private Long productId;
    private ProductDto productDto;
    private Integer qty;
    private String color;
    private String material;

    public LineItem(ProductDto productDto, String color, String material) {
        this.productId = productDto.getId();
        this.productDto = productDto;
        this.color = color;
        this.material = material;
    }

    public LineItem() {
    }

    public Integer getItemTotal() {
        return productDto.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LineItem lineItem = (LineItem) o;
        return productId.equals(lineItem.productId) &&
                Objects.equals(color, lineItem.color) &&
                Objects.equals(material, lineItem.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, color, material);
    }
}
