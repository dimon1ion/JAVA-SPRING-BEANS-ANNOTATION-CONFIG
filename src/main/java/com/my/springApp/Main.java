package com.my.springApp;

import com.my.springApp.configs.SpringConfig;
import com.my.springApp.models.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        List<Car> cars = new ArrayList<>();
        cars.add(context.getBean("carFerrariF223", Car.class));
        cars.add(context.getBean("carFerrariLuxury", Car.class));
        cars.add(context.getBean("carBmwX5M23", Car.class));
        cars.add(context.getBean("carBmw_PressF", Car.class));
        cars.forEach(System.out::println);
    }
}
