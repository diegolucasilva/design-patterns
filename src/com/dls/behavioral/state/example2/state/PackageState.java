package com.dls.behavioral.state.example2.state;

import com.dls.behavioral.state.example2.context.DeliveryContext;

public interface PackageState {
    public void updateState(DeliveryContext ctx);
}