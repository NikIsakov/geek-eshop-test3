package ru.geekbrains.persist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.persist.model.Blog;
import ru.geekbrains.persist.model.Role;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {
}
