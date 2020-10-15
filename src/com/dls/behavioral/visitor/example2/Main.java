package com.dls.behavioral.visitor.example2;

/*
Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects.
With the help of visitor pattern, we can move the operational logic from the objects to another class.

EX:
For example, think of a Shopping cart where we can add different type of items (Elements). When we click on
checkout button, it calculates the total amount to be paid.Now we can have the calculation logic in
item classes or we can move out this logic  to another class using visitor pattern.
 */


import com.dls.behavioral.visitor.example2.elements.Document;
import com.dls.behavioral.visitor.example2.elements.JsonElement;
import com.dls.behavioral.visitor.example2.elements.XmlElement;
import com.dls.behavioral.visitor.example2.visitor.ElementVisitor;
import com.dls.behavioral.visitor.example2.visitor.Visitor;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new XmlElement(generateUuid()));

        d.accept(v);
    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }
}

