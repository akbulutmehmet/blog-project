package com.akbulutmehmet.blogproject.repository;

import com.akbulutmehmet.blogproject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
