package com.my.springApp.models;

import java.util.List;

public class Car {
    private String brand;
    private String name;
    private double margin;
    private Engine engine;
    private Transmission transmission;
    private List<Wheel> wheels;
    private Body body;

    public Engine getEngine() {
        return engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMargin() {
        return margin;
    }

    public void setMargin(double margin) {
        this.margin = margin;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        StringBuilder carInfo = new StringBuilder();
        carInfo.append("CarInfo:" +
                "\nBrand: " + brand +
                "\nName: " + name +
                "\nBody: " + body.getType().name() +
                "\nTransmission: " + transmission.getType().name() +
                "\nEngine: " +
                "\n\thorse power:" + engine.getHorsepower() +
                "\n\tvolume:" + engine.getVolume() +
                "\nWheels:" );
        wheels.forEach(wheel -> carInfo.append("\n\tdiameter:" + wheel.getDiameter()));
        carInfo.append("\n");
        return carInfo.toString();
    }
}
