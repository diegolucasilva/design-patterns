package com.dls.behavioral.mediator.user;

import com.dls.behavioral.mediator.mediator.Mediator;

public abstract class User {
    private Mediator room;
    private String id;
    private String name;

    public User(Mediator room, String id, String name){
        this.room = room;
        this.name = name;
        this.id = id;
    }

    public Mediator getMediator() {
        return room;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);
}