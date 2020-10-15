package com.dls.behavioral.visitor.example2.visitor;

import com.dls.behavioral.visitor.example2.elements.JsonElement;
import com.dls.behavioral.visitor.example2.elements.XmlElement;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element with uuid: " + je.uuid);
    }
}