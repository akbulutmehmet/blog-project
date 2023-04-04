package com.akbulutmehmet.blogproject.controller;

import com.akbulutmehmet.blogproject.dto.BlogDto;
import com.akbulutmehmet.blogproject.dto.CreateBlogRequest;
import com.akbulutmehmet.blogproject.model.Blog;
import com.akbulutmehmet.blogproject.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/blog")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }
    @PostMapping(value = "createBlog")
    public ResponseEntity<BlogDto> createBlog (@Valid  @RequestBody CreateBlogRequest createBlogRequest){
        return ResponseEntity.ok(blogService.createBlog(createBlogRequest));
    }
}
