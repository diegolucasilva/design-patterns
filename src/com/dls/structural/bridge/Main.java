package com.dls.structural.bridge;

import com.dls.structural.adapter.JsonPlug;
import com.dls.structural.adapter.LibraryCompatibleWithJson;
import com.dls.structural.adapter.XmlPlug;
import com.dls.structural.adapter.XmlToJsonAdapter;
import com.dls.structural.bridge.devices.Device;
import com.dls.structural.bridge.devices.Radio;
import com.dls.structural.bridge.devices.Tv;
import com.dls.structural.bridge.remotes.AdvancedRemote;
import com.dls.structural.bridge.remotes.BasicRemote;

/*
Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two
separate hierarchies—abstraction and implementation—which can be developed independently of each other.
https://refactoring.guru/design-patterns/bridge

Example without pattern:
interface Device
    RadioRemote
    RadioReAdvanced
    Tv
    TvAdvanced
-------------
Example Bridge between devices and remote controls:
interface Device
    Radio
    TV
interface Remote   //Composition Device
    Basic Remote(device)
    AdvancedRemote(device)

The Bridge pattern allows changing or even creating new classes without touching the code of the opposite hierarchy.
 */
public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
