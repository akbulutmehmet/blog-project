package com.akbulutmehmet.blogproject.dto.converter;

import com.akbulutmehmet.blogproject.dto.BlogDto;
import com.akbulutmehmet.blogproject.dto.CategoryDto;
import com.akbulutmehmet.blogproject.model.Category;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CategoryBlogDtoConverter {
    private final BlogDtoConverter blogDtoConverter;

    public CategoryBlogDtoConverter(BlogDtoConverter blogDtoConverter) {
        this.blogDtoConverter = blogDtoConverter;
    }

    public CategoryDto convert(Category category){
        Set<BlogDto> blogDtoSet = category.getBlogSet().stream().map(blogDtoConverter::convert).collect(Collectors.toSet());
        return new CategoryDto(category.getId(), category.getTitle(), category.getSeoSlug(),
                blogDtoSet, category.getCreationDate());
  }
}
