package com.dls.structural.decorator.decorator;

import com.dls.structural.decorator.product.Car;

public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}