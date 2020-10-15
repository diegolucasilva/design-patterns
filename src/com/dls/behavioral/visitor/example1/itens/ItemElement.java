package com.dls.behavioral.visitor.example1.itens;

import com.dls.behavioral.visitor.example1.visitor.ShoppingCartVisitor;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
