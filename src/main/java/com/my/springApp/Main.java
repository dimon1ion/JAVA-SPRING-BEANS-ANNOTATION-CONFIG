package com.my.springApp;

import com.my.springApp.models.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        List<Car> cars = new ArrayList<>();
        cars.add(context.getBean("carFerrariF2-23", Car.class));
        cars.add(context.getBean("carFerrari-luxury", Car.class));
        cars.add(context.getBean("carBmwX5M-23", Car.class));
        cars.add(context.getBean("carBmw-PressF", Car.class));

        cars.forEach(System.out::println);
    }
}
