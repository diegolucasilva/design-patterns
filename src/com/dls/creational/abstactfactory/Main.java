package com.dls.creational.abstactfactory;
/*
Abstract Factory is a creational design pattern that lets you produce
families of related objects without specifying their concrete classes.
Factory of factories
 */

import com.dls.creational.abstactfactory.factories.GUIFactory;

public class Main {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    public static void main(String[] args) {
        GUIFactory factory = GUIFactory.getGUIFactory("mac");
        AppFactory app = new AppFactory(factory);
        app.paint();
    }
}
