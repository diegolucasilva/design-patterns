package com.dls.structural.decorator;

/*
Is used to modify the functionality of an object at runtime
https://refactoring.guru/design-patterns/decorator/java/example
 */

public class Main {

    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
