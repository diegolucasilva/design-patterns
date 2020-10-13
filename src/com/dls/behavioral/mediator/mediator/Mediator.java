package com.dls.behavioral.mediator.mediator;

import com.dls.behavioral.mediator.user.User;

public interface Mediator {
    void sendMessage(String msg, String userId);
    void addUser(User user);
}