package com.dls.behavioral.state.example1.context;

import com.dls.behavioral.state.example1.state.State;
import com.dls.behavioral.state.example1.state.TVStartState;
import com.dls.behavioral.state.example1.state.TVStopState;

/*
State is a behavioral design pattern that lets an object alter its behavior when its internal state changes.
 It appears as if the object changed its class.

 */
public class Main {

    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();
    }
}

