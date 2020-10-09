package com.dls.creational.factorymethod.basic;

public class PolygonFactory {
    public static Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
        }
        if (numberOfSides == 4) {
            return new Square();
        }
        return null;
    }
}
