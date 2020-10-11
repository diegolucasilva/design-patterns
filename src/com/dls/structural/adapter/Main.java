package com.dls.structural.adapter;

/*
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate
EX:
java.util.Arrays#asList()
java.util.Collections#list()


Imagine that you’re creating a stock market monitoring app.
The app downloads the stock data from multiple sources in XML format and then displays nice-looking charts and diagrams for the user.
At some point, you decide to improve the app by integrating a smart 3rd-party analytics library.
 But there’s a catch: the analytics library only works with data in JSON format
 */
public class Main {

    public static void main(String[] args) {

        LibraryCompatibleWithJson analitics = new LibraryCompatibleWithJson();

        JsonPlug jsonPlug = new JsonPlug(); //This class is ok, we can use without problem
        analitics.anayticsStart(jsonPlug);

        XmlPlug xmlPlug = new XmlPlug();   //Ops, XmlPlug is not compatible with the external library
        XmlToJsonAdapter xmlToJsonAdapter = new XmlToJsonAdapter(xmlPlug); //now it is ok

        analitics.anayticsStart(xmlToJsonAdapter);


    }
}
