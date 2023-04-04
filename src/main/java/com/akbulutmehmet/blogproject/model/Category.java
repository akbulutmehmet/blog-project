package com.akbulutmehmet.blogproject.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "title",nullable = false)
    private String title;

    @Column(name = "seo_slug",nullable = false,unique = true)
    private String seoSlug;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Set<Blog> blogSet;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Category() {

    }

    public Category(String title, String seoSlug) {
        this.title = title;
        this.seoSlug = seoSlug;
        this.creationDate = new Date();
    }

    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
