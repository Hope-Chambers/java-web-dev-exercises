package org.launchcode.java.studios.resturant;

import java.util.Objects;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew = true;

    private String name;

    private int id;

    public MenuItem (double price, String description, String category, String name, int id) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.name=name;
        this.id=id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    public void printMenuItem(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(description);
        System.out.println(category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem menuItem)) return false;
        return id == menuItem.id;
    }

}

