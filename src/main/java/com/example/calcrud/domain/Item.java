package com.example.calcrud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private String ID;

    @Column
    private String name;

    @Column
    private Category category;

    @Column
    private Integer quantity;

    public Item(String ID, String name, Category category, Integer quantity) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    protected Item() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
