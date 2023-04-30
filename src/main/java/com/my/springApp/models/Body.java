package com.my.springApp.models;

import com.my.springApp.models.enums.BodyType;

public class Body {
    private BodyType type;
    private double weight;
    private double price;

    public BodyType getType() {
        return type;
    }

    public void setType(BodyType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
