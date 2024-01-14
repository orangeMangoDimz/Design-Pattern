package main;

import handler.HandlerA;
import handler.HandlerB;
import model.Request;

public class Main {
    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        handlerA.hasNextHandler(handlerB);

        Request request1 = new Request("My name is Dimas Dani");
        Request request2 = new Request("My name is Udin Baharudin");

        handlerA.handle(request1);
        handlerA.handle(request2);

        System.out.println("Status request 1t: " + request1.isHandled());
        System.out.println("Status request 2t: " + request2.isHandled());
    }
}
