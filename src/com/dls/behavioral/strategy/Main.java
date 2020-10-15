package com.dls.behavioral.strategy;

/*
Strategy is a behavioral design pattern that lets you define a family of algorithms,
put each of them into a separate class, and make their objects interchangeable.

Usage examples: The Strategy pattern is very common in Java code. It’s often used in various frameworks
to provide users a way to change the behavior of a class without extending it.

EX:
java.util.Comparator#compare() called from Collections#sort().
*/

import com.dls.behavioral.strategy.strategy.CreditCardStrategy;
import com.dls.behavioral.strategy.strategy.PaypalStrategy;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);
        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
        //pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
    }
}

