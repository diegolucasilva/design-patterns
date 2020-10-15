package com.dls.behavioral.observer.example1;
/*
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify
multiple objects about any events that happen to the object they’re observing.

EX:
java.util.Observer/java.util.Observable (rarely used in real world)
 */

import com.dls.behavioral.observer.example1.editor.Editor;
import com.dls.behavioral.observer.example1.listeners.EmailNotificationListener;
import com.dls.behavioral.observer.example1.listeners.LogOpenListener;
import com.dls.behavioral.observer.example2.observer.MyTopicSubscriber;
import com.dls.behavioral.observer.example2.observer.Observer;
import com.dls.behavioral.observer.example2.subject.MyTopic;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEventManager().subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.getEventManager().subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

