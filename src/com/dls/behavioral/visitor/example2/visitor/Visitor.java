package com.dls.behavioral.visitor.example2.visitor;

import com.dls.behavioral.visitor.example2.elements.JsonElement;
import com.dls.behavioral.visitor.example2.elements.XmlElement;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}
