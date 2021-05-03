package com.ims.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materials {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private int qty;
    private String author;

    public Materials() {
    }

    public Materials(String name, String category, int qty, String author) {
        this.name = name;
        this.category = category;
        this.qty = qty;
        this.author = author;
    }

    public Materials(Long id, String name, String category, int qty, String author) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.qty = qty;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", qty=" + qty +
                ", author='" + author + '\'' +
                '}';
    }
}
