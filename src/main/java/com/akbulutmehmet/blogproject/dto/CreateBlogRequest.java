package com.akbulutmehmet.blogproject.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class CreateBlogRequest {
    @NotBlank(message = "Title field should not be blank")
    @NotEmpty(message =  "Title field should not be emty")
    private String title;
    @NotBlank(message = "Seo slug field should not be blank")
    @NotEmpty(message =  "Seo slug field should not be emty")
    private String seoSlug;
    @NotBlank(message = "Blog body field should not be blank")
    @NotEmpty(message =  "Blog body field should not be emty")
    private String body;
    @NotBlank(message = "Category  field should not be blank")
    @NotEmpty(message =  "Category  field should not be emty")
    private String categoryId;

    public CreateBlogRequest(String title, String seoSlug, String body, String categoryId) {
        this.title = title;
        this.seoSlug = seoSlug;
        this.body = body;
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeoSlug() {
        return seoSlug;
    }

    public void setSeoSlug(String seoSlug) {
        this.seoSlug = seoSlug;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }


}
