package com.codecool.readersrealmbackend.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String author;
    private String series;
    private String publisher;
    private long ISBN;
    private long numberOfPages;
    private String details;
    @OneToMany
    private Set<Label> labels;
    @OneToMany
    private Set<Review> reviews;

    @OneToMany
    private Set<User> markedAsFavorite;

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public long getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(long numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Set<Label> getLabels() {
        return labels;
    }

    public void setLabels(Set<Label> labels) {
        this.labels = labels;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<User> getMarkedAsFavorite() {
        return markedAsFavorite;
    }

    public void setMarkedAsFavorite(Set<User> markedAsFavorite) {
        this.markedAsFavorite = markedAsFavorite;
    }
}
