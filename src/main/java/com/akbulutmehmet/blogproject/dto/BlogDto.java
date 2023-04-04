package com.akbulutmehmet.blogproject.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class BlogDto {
    private String id;
    private String title;
    private String seoSlug;
    private String body;
    @JsonFormat(pattern = "dd-MM-yyyy hh:MM:ss")
    private Date creationDate;

    public BlogDto(String id, String title, String seoSlug, String body, Date creationDate) {
        this.id = id;
        this.title = title;
        this.seoSlug = seoSlug;
        this.body = body;
        this.creationDate = creationDate;
    }




    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
