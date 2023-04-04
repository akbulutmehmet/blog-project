package com.akbulutmehmet.blogproject.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Blog implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "seo_slug",nullable = false,unique = true)
    private String seoSlug;

    @Column(name = "body",nullable = false)
    private String body;


    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;

    public Blog(String title, String seoSlug, String body,Category category,Date creationDate) {
        this.title = title;
        this.seoSlug = seoSlug;
        this.body = body;
        this.category= category;
        this.creationDate= creationDate;
    }

    public Blog() {

    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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
