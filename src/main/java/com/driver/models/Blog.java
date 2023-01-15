package com.driver.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String title;

    private String content;

    @CreationTimestamp
    private Date pubDate;

    public Blog(String title, String content) {
        this.title=title;
        this.content=content;
    }


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Blog() {
    }

    @ManyToOne
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Image> imageList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public Blog(int id, String title, String content, Date pubDate, User user, List<Image> imageList) {
        Id = id;
        this.title = title;
        this.content = content;
        this.pubDate = pubDate;
        this.user = user;
        this.imageList = imageList;
    }
}