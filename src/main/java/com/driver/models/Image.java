package com.driver.models;

import javax.persistence.*;

@Entity
@Table
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;

    private String description;
    private String dimensions;

    public Image(int imageId, String description, String dimensions) {
        this.imageId = imageId;
        this.description = description;
        this.dimensions = dimensions;
    }
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

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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
    @ManyToOne
    @JoinColumn
    private Blog blog;

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

}