package com.akbulutmehmet.blogproject.service;

import com.akbulutmehmet.blogproject.dto.BlogDto;
import com.akbulutmehmet.blogproject.dto.CreateBlogRequest;
import com.akbulutmehmet.blogproject.dto.converter.BlogDtoConverter;
import com.akbulutmehmet.blogproject.model.Blog;
import com.akbulutmehmet.blogproject.model.Category;
import com.akbulutmehmet.blogproject.repository.BlogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true)
public class BlogService {
    private final BlogRepository blogRepository;
    private final  CategoryService categoryService;
    private final BlogDtoConverter converter;
    public BlogService(BlogRepository blogRepository, CategoryService categoryService,
                       BlogDtoConverter converter) {
        this.blogRepository = blogRepository;
        this.categoryService = categoryService;
        this.converter=converter;
    }

    @Transactional(readOnly = false)
    public BlogDto createBlog(CreateBlogRequest createBlogRequest) {
        Category category = categoryService.findById(createBlogRequest.getCategoryId());
        Blog blog = blogRepository.save(
                new Blog(createBlogRequest.getTitle()
                        ,createBlogRequest.getSeoSlug()
                        ,createBlogRequest.getBody()
                        ,category,new Date()));
         return converter.convert(blog);
    }

}
