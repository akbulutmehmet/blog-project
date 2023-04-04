package com.akbulutmehmet.blogproject.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class CategoryDto implements Serializable {

    private String id;
    private String title;
    private String seoSlug;
    private Set<BlogDto> blogDtoList;
    @JsonFormat(pattern = "dd-MM-yyyy hh:MM:ss")
    private Date creationDate;

    public CategoryDto(String id, String title, String seoSlug, Set<BlogDto> blogDtoList, Date creationDate) {
        this.id = id;
        this.title = title;
        this.seoSlug = seoSlug;
        this.blogDtoList = blogDtoList;
        this.creationDate = creationDate;
    }

    public CategoryDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Set<BlogDto> getBlogDtoList() {
        return blogDtoList;
    }

    public void setBlogDtoList(Set<BlogDto> blogDtoList) {
        this.blogDtoList = blogDtoList;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
