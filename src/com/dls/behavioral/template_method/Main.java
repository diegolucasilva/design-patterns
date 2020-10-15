package com.dls.behavioral.template_method;
/*
Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the
superclass but lets subclasses override specific steps of the algorithm without changing its structure.

EX:
java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
 */

import com.dls.behavioral.template_method.house.GlassHouse;
import com.dls.behavioral.template_method.house.WoodenHouse;
import com.dls.behavioral.template_method.template.HouseTemplate;

public class Main {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}

