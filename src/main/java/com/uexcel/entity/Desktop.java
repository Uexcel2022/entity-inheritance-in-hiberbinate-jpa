package com.uexcel.entity;

import jakarta.persistence.Entity;

@Entity
public class Desktop extends Computer {

    private String brand;
    private String price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desktop [brand=" + brand + ", name=" + name + ", price=" + price + "]";
    }

}
