package com.akbulutmehmet.blogproject.service;

import com.akbulutmehmet.blogproject.dto.CategoryDto;
import com.akbulutmehmet.blogproject.dto.CreateCategoryRequest;
import com.akbulutmehmet.blogproject.dto.converter.CategoryBlogDtoConverter;
import com.akbulutmehmet.blogproject.exception.CategoryException;
import com.akbulutmehmet.blogproject.model.Category;
import com.akbulutmehmet.blogproject.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryBlogDtoConverter converter;

    public CategoryService(CategoryRepository categoryRepository, CategoryBlogDtoConverter converter) {
        this.categoryRepository = categoryRepository;
        this.converter = converter;
    }

    public Category findById(String id) {
        return categoryRepository.findById(id).orElseThrow(
                () -> new CategoryException("Category could not find by id" + id));
    }

    public Category createCategory(CreateCategoryRequest createCategoryRequest) {
        return categoryRepository.save(new Category(createCategoryRequest.getTitle(),createCategoryRequest.getSeoSlug()));
    }

    public CategoryDto getCategory(String id) {
        Category category = findById(id);

        return converter.convert(category);
    }
}
