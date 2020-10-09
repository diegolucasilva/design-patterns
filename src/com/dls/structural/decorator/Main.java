package com.dls.structural.decorator;

/*
Is used to modify the functionality of an object at runtime
https://refactoring.guru/design-patterns/decorator/java/example

It is a structural design pattern that lets you attach new behaviors to objects by placing
these objects inside special wrapper objects that contain the behaviors.
Add responsibilities to objects dynamically

 */

import com.dls.structural.decorator.product.BasicCar;
import com.dls.structural.decorator.product.Car;
import com.dls.structural.decorator.decorator.LuxuryCar;
import com.dls.structural.decorator.decorator.SportsCar;

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
