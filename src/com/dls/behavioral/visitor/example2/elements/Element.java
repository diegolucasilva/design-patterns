package com.dls.behavioral.visitor.example2.elements;

import com.dls.behavioral.visitor.example2.visitor.Visitor;

public abstract class Element {

    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}