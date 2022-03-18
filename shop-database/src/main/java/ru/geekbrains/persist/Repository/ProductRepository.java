package ru.geekbrains.persist.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import ru.geekbrains.persist.model.Product;
import ru.geekbrains.persist.model.Score;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {

    Page<Product> findAll(@Nullable Specification<Product> spec, Pageable pageable);

    List<Product> findProductByNameLike(String name);

    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);
}
