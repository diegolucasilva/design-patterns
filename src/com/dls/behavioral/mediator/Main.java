package com.dls.behavioral.mediator;
/*
Mediator design pattern is very helpful in an enterprise application where multiple objects are
interacting with each other. If the objects interact with each other directly, the system components
are tightly-coupled with each other that makes higher maintainability cost and not hard to extend.
Mediator pattern focuses on provide a mediator between objects for communication and help in
implementing lose-coupling between objects.

This pattern provides a mediator class which normally handles all the communications between different
classes and supports easy maintenance of the code by loose coupling
https://sourcemaking.com/design_patterns/mediator
https://howtodoinjava.com/design-patterns/behavioral/mediator-pattern/
 */

import com.dls.behavioral.mediator.mediator.ChatRoom;
import com.dls.behavioral.mediator.mediator.Mediator;
import com.dls.behavioral.mediator.user.ChatUser;
import com.dls.behavioral.mediator.user.User;

public class Main {

    public static void main(String[] args) {
        Mediator chatroom = new ChatRoom();

        User brian = new ChatUser(chatroom,"brian_", "Brian");
        User diego = new ChatUser(chatroom,"dlsbpkv", "Diego");
        User charles = new ChatUser(chatroom,"charl", "Charles");
        User david = new ChatUser(chatroom,"dvd", "David");

        chatroom.addUser(diego);
        chatroom.addUser(brian);
        chatroom.addUser(charles);
        chatroom.addUser(david);

        brian.send("Hello Diego", "dlsbpkv");
        diego.send("Hey buddy", "brian_");
    }
}
