package com.driver.models;

import javax.persistence.*;

@Entity
@Table
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String description;
    private String dimensions;


    public Image(Blog blog, String description, String dimensions) {
        this.blog = blog;
        this.description = description;
        this.dimensions = dimensions;
    }

    public Image() {
    }

    public Image(String description, String dimensions) {
        this.description=description;
        this.dimensions=dimensions;
    }


    @ManyToOne
    @JoinColumn
    private Blog blog;

    public Image(int id, String description, String dimensions, Blog blog) {
        Id = id;
        this.description = description;
        this.dimensions = dimensions;
        this.blog = blog;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}