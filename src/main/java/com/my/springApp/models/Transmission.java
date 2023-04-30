package com.my.springApp.models;

import com.my.springApp.models.enums.TransmissionType;

public class Transmission {
    private int numberOfGears;
    private TransmissionType type;
    private double weight;
    private double price;

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public TransmissionType getType() {
        return type;
    }

    public void setType(TransmissionType type) {
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
