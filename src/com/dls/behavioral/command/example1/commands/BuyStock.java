package com.dls.behavioral.command.example1.commands;

import com.dls.behavioral.command.example1.receiver.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}