package com.dls.behavioral.command.example1;
/*
The pattern intends to encapsulate in an object all the data required for performing a given action (command),
 including what method to call, the method's arguments, and the object to which the method belongs.

This model allows us to decouple objects that produce the commands from their consumers,
so that's why the pattern is commonly known as the producer-consumer pattern.

Command design pattern is used to implement loose coupling in a request-response model.

Use the Command pattern when you want to queue operations, schedule their execution, or execute them remotely.
 Use the Command pattern when you want to implement reversible operations(undo,redo)


*****
In command pattern, the request is send to the INVOKER(SENDER) and INVOKER pass it to the encapsulated COMMAND object.

Command object passes the request to the appropriate method of RECEIVER to perform the specific action.

The CLIENT program create the RECEIVER object and then attach it to the COMMAND.
Then it creates the INVOKER(SENDER) object and attach the command object to perform an action.

Now when client program executes the action, it’s processed based on the command and receiver object.
*****
 */

import com.dls.behavioral.command.example1.commands.BuyStock;
import com.dls.behavioral.command.example1.commands.SellStock;
import com.dls.behavioral.command.example1.receiver.Stock;
import com.dls.behavioral.command.example1.invoker.Broker;

public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();  //receiver

        BuyStock buyStockOrder = new BuyStock(abcStock); //command
        SellStock sellStockOrder = new SellStock(abcStock); //command

        Broker broker = new Broker();  //invoker(sender)
        broker.takeOrder(buyStockOrder);  //we can save a lot of commands here
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
