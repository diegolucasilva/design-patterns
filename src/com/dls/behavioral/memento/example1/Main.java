package com.dls.behavioral.memento.example1;
/*
Memento is a behavioral design pattern that lets you save and restore the previous
state of an object without revealing the details of its implementation.

EX:
All java.io.Serializable implementations can simulate the Mement
 */

public class Main {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        caretaker.addMemento( originator.save() );
        originator.setState("State3");
        caretaker.addMemento( originator.save() );
        originator.setState("State4");
        originator.restore( caretaker.getMemento() );
    }
}
