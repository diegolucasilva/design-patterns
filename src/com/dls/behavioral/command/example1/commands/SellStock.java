package com.dls.behavioral.command.example1.commands;

import com.dls.behavioral.command.example1.receiver.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}