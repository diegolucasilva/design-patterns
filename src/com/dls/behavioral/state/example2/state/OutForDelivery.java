package com.dls.behavioral.state.example2.state;

import com.dls.behavioral.state.example2.context.DeliveryContext;

public class OutForDelivery implements PackageState {
    //Singleton
    public static OutForDelivery instance = new OutForDelivery();

    private OutForDelivery() {}

    public static OutForDelivery instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}