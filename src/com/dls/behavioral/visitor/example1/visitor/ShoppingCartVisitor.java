package com.dls.behavioral.visitor.example1.visitor;

import com.dls.behavioral.visitor.example1.itens.Book;
import com.dls.behavioral.visitor.example1.itens.Fruit;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
