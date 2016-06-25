package com.thoughtworks.bookish.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private String asin;
    private String isbn;
    @Column(name = "published_at")
    private Date publishedAt;
    //    private String description;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAsin() {
        return asin;
    }

    public String getIsbn() {
        return isbn;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }
}
