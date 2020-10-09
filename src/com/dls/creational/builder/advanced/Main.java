package com.dls.creational.builder.advanced;
/*
In this example, the Builder pattern allows step by step construction of different car models.
The example also shows how Builder produces products of different kinds (car manual) using the same building steps.
The Director controls the order of the construction. It knows which building steps to call to produce this or that car model.
It works with builders only via their common interface. This allows passing different types of builders to the director.
The end result is retrieved from the builder object because the director can’t know the type of resulting product.
 Only the Builder object knows what does it build exactly.
https://refactoring.guru/pt-br/design-patterns/builder/java/example
 */
import com.dls.creational.builder.advanced.builders.CarBuilder;
import com.dls.creational.builder.advanced.builders.CarManualBuilder;
import com.dls.creational.builder.advanced.product.Car;
import com.dls.creational.builder.advanced.product.Director;
import com.dls.creational.builder.advanced.product.Manual;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
