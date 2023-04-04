package com.akbulutmehmet.blogproject.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class CreateCategoryRequest {
    @NotBlank(message = "Title field should not be blank")
    @NotEmpty(message =  "Title field should not be emty")
    private String title;

    @NotBlank(message = "Seo slug field should not be blank")
    @NotEmpty(message = "Seo slug field should not be blank")
    private String seoSlug;

    public CreateCategoryRequest() {
    }

    public CreateCategoryRequest(String title, String seoSlug) {
        this.title = title;
        this.seoSlug = seoSlug;
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
}
