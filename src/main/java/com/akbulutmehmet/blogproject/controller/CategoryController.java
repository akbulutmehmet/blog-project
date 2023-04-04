package com.akbulutmehmet.blogproject.controller;

import com.akbulutmehmet.blogproject.dto.CategoryDto;
import com.akbulutmehmet.blogproject.dto.CreateCategoryRequest;
import com.akbulutmehmet.blogproject.model.Category;
import com.akbulutmehmet.blogproject.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "/api/v1/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping("createCategory")
    public ResponseEntity<Category> createCategory (@Valid @RequestBody CreateCategoryRequest createCategoryRequest) {
        return ResponseEntity.ok(categoryService.createCategory(createCategoryRequest));
    }
    @GetMapping(value = "getCategory/{id}")
    public ResponseEntity<CategoryDto> getCategory (@PathVariable("id") String id) {
        return ResponseEntity.ok(categoryService.getCategory(id));
    }
}
