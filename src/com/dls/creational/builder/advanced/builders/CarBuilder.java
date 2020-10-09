package com.dls.creational.builder.advanced.builders;


import com.dls.creational.builder.advanced.feature.Engine;
import com.dls.creational.builder.advanced.feature.GPSNavigator;
import com.dls.creational.builder.advanced.feature.Transmission;
import com.dls.creational.builder.advanced.feature.TripComputer;
import com.dls.creational.builder.advanced.product.Car;
import com.dls.creational.builder.advanced.product.Type;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}