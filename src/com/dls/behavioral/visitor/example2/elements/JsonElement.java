package com.dls.behavioral.visitor.example2.elements;

import com.dls.behavioral.visitor.example2.visitor.Visitor;

public class JsonElement extends Element {

    public JsonElement(String uuid) {
        super(uuid);
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
