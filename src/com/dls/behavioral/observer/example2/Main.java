package com.dls.behavioral.observer.example2;
/*
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify
multiple objects about any events that happen to the object they’re observing.

EX:
java.util.Observer/java.util.Observable (rarely used in real world)
 */

import com.dls.behavioral.observer.example2.observer.MyTopicSubscriber;
import com.dls.behavioral.observer.example2.observer.Observer;
import com.dls.behavioral.observer.example2.subject.MyTopic;

public class Main {

    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer observer1 = new MyTopicSubscriber("observer1");
        Observer observer2 = new MyTopicSubscriber("observer2");
        Observer observer3 = new MyTopicSubscriber("observer3");

        //register observers to the subject
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);

        //attach observer to subject
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        //check if any update is available
        observer1.update();

        //now send message to subject
        topic.postMessage("New Message");
    }
}
