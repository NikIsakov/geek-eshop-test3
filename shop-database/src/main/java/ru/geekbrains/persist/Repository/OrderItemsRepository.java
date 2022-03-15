package ru.geekbrains.persist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.persist.model.OrderItems;
import ru.geekbrains.persist.model.Role;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
}
