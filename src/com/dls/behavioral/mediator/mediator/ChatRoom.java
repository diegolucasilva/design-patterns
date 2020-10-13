package com.dls.behavioral.mediator.mediator;

import com.dls.behavioral.mediator.user.User;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom implements Mediator {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId)
    {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}