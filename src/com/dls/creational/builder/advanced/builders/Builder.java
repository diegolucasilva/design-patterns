package com.dls.creational.builder.advanced.builders;

import com.dls.creational.builder.advanced.feature.Engine;
import com.dls.creational.builder.advanced.feature.GPSNavigator;
import com.dls.creational.builder.advanced.feature.Transmission;
import com.dls.creational.builder.advanced.feature.TripComputer;
import com.dls.creational.builder.advanced.product.Type;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
