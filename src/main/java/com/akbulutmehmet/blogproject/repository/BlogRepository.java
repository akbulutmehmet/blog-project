package com.akbulutmehmet.blogproject.repository;

import com.akbulutmehmet.blogproject.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,String> {
}
