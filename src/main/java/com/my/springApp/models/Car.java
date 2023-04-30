package com.my.springApp.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(value = "prototype")
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

    public double getTotalPrice(){
        double totalsum = margin;
        if (engine != null)
            totalsum += engine.getPrice();
        if (transmission != null)
            totalsum += transmission.getPrice();
        if (!wheels.isEmpty())
            totalsum += wheels.stream().mapToDouble(Wheel::getPrice).sum();
        if (body != null)
            totalsum += body.getPrice();
        return totalsum;
    }

    public double getTotalWeight(){
        double totalWeight = 0;
        if (engine != null)
            totalWeight += engine.getWeight();
        if (transmission != null)
            totalWeight += transmission.getWeight();
        if (!wheels.isEmpty())
            totalWeight += wheels.stream().mapToDouble(Wheel::getWeight).sum();
        if (body != null)
            totalWeight += body.getWeight();
        return totalWeight;
    }

    @Override
    public String toString() {
        StringBuilder carInfo = new StringBuilder();
        carInfo.append("CarInfo:" +
                "\nBrand: " + brand +
                "\nName: " + name +
                "\nBody: " + body.getType().name() +
                "\nTransmission: " +
                "\n\tType:" + transmission.getType().name() +
                "\n\tNumber of gears: " + transmission.getNumberOfGears() +
                "\nEngine: " +
                "\n\thorse power:" + engine.getHorsepower() +
                "\n\tvolume:" + engine.getVolume() +
                "\nWheels:" );
        wheels.forEach(wheel -> carInfo.append("\n\tdiameter:" + wheel.getDiameter()));
        carInfo.append("\nPrice: " + getTotalPrice());
        carInfo.append("\nWeight: " + getTotalWeight() + "\n");
        return carInfo.toString();
    }
}
