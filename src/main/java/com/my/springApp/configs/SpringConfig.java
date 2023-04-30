package com.my.springApp.configs;

import com.my.springApp.models.*;
import com.my.springApp.models.enums.BodyType;
import com.my.springApp.models.enums.TransmissionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@ComponentScan(value = "com.my.springApp.models")
public class SpringConfig {

    @Bean
    @Scope(value = "prototype")
    public Engine engineFerrari(){
        Engine engine = new Engine();
        engine.setHorsepower(1200);
        engine.setVolume(100);
        engine.setWeight(2354);
        engine.setPrice(2356.1);
        return engine;
    }

    @Bean
    @Scope(value = "prototype")
    public Engine engineBmw(){
        Engine engine = new Engine();
        engine.setHorsepower(700);
        engine.setVolume(100);
        engine.setWeight(3214);
        engine.setPrice(1234.1);
        return engine;
    }

    @Bean
    @Scope(value = "prototype")
    public Transmission manual8Transmission(){
        Transmission transmission = new Transmission();
        transmission.setNumberOfGears(8);
        transmission.setType(TransmissionType.Manual);
        transmission.setWeight(30.56);
        transmission.setPrice(400);
        return transmission;
    }

    @Bean
    @Scope(value = "prototype")
    public Transmission automatic6Transmission(){
        Transmission transmission = new Transmission();
        transmission.setNumberOfGears(6);
        transmission.setType(TransmissionType.Automatic);
        transmission.setWeight(42.10);
        transmission.setPrice(430);
        return transmission;
    }

    @Bean
    @Scope(value = "prototype")
    public Wheel wheel18(){
        Wheel wheel = new Wheel();
        wheel.setDiameter(18);
        wheel.setPrice(60);
        wheel.setWeight(50);
        return wheel;
    }

    @Bean
    @Scope(value = "prototype")
    public Wheel wheel16(){
        Wheel wheel = new Wheel();
        wheel.setDiameter(16);
        wheel.setPrice(54);
        wheel.setWeight(46);
        return wheel;
    }

    @Bean
    @Scope(value = "prototype")
    public Body sedanBodyFerrari(){
        Body body = new Body();
        body.setType(BodyType.Sedan);
        body.setPrice(798);
        body.setWeight(243);

        return body;
    }

    @Bean
    @Scope(value = "prototype")
    public Body coupeBodyBmwX5M(){
        Body body = new Body();
        body.setType(BodyType.Coupe);
        body.setPrice(574);
        body.setWeight(481);

        return body;
    }

    @Bean
    @Scope(value = "prototype")
    @Autowired
    public Car carFerrariF223(@Qualifier(value = "engineFerrari") Engine engine,
                              @Qualifier(value = "manual8Transmission") Transmission transmission,
                              @Qualifier(value = "wheel16") Wheel wheel1,
                              @Qualifier(value = "wheel16") Wheel wheel2,
                              @Qualifier(value = "wheel16") Wheel wheel3,
                              @Qualifier(value = "wheel16") Wheel wheel4,
                              @Qualifier(value = "sedanBodyFerrari") Body body){
        Car car = new Car();
        car.setBrand("Ferrari");
        car.setName("F2-23");
        car.setMargin(430);
        car.setEngine(engine);
        car.setTransmission(transmission);
        car.setWheels(new ArrayList<>(Arrays.asList(wheel1, wheel2, wheel3, wheel4)));
        car.setBody(body);
        return car;
    }

    @Bean
    @Scope(value = "prototype")
    public Car carFerrariLuxury(){
        Car car = new Car();
        car.setBrand("Ferrari");
        car.setName("LuxuryV");
        car.setMargin(430);
        car.setEngine(engineFerrari());
        car.setTransmission(automatic6Transmission());
        car.setWheels(new ArrayList<>(Arrays.asList(wheel16(), wheel16(), wheel16(), wheel16())));
        car.setBody(coupeBodyBmwX5M());
        return car;
    }

    @Bean
    @Scope(value = "prototype")
    public Car carBmwX5M23(){
        Car car = new Car();
        car.setBrand("Bmw");
        car.setName("X5M-23");
        car.setMargin(210);
        car.setEngine(engineBmw());
        car.setTransmission(automatic6Transmission());
        car.setWheels(new ArrayList<>(Arrays.asList(wheel18(), wheel18(), wheel18(), wheel18())));
        car.setBody(coupeBodyBmwX5M());
        return car;
    }

    @Bean
    @Scope(value = "prototype")
    public Car carBmw_PressF(){
        Car car = new Car();
        car.setBrand("Bmw");
        car.setName("PressF");
        car.setMargin(210);
        car.setEngine(engineFerrari());
        car.setTransmission(manual8Transmission());
        car.setWheels(new ArrayList<>(Arrays.asList(wheel18(), wheel18(), wheel16(), wheel16())));
        car.setBody(coupeBodyBmwX5M());
        return car;
    }
}
