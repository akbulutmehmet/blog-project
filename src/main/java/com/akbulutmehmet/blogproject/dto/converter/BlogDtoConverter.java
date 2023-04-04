package com.akbulutmehmet.blogproject.dto.converter;

import com.akbulutmehmet.blogproject.dto.BlogDto;
import com.akbulutmehmet.blogproject.model.Blog;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class BlogDtoConverter {
    public BlogDto convert(Blog blog) {
        return new BlogDto(blog.getId(),
                blog.getTitle(),
                blog.getSeoSlug(),
                blog.getBody(),blog.getCreationDate() );
    }
}
