package com.dls.behavioral.state.example2;


import com.dls.behavioral.state.example2.context.DeliveryContext;

/*
State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
 It appears as if the object changed its class.
 */
public class Main {
    public static void main(String[] args) {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}

