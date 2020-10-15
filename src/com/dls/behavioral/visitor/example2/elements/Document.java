package com.dls.behavioral.visitor.example2.elements;

import com.dls.behavioral.visitor.example2.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

    public List<Element> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        for (Element e : this.elements) {
            e.accept(v);
        }
    }
}