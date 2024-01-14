package handler;

import model.Request;

public class HandlerB extends Handler{
    private Handler nextHandler;
    @Override
    public void handle(Request request) {
        System.out.println("HandlerB is handling the request ...");
        if (request.getContent().contains("Dani")){
            request.setHandled(true);
            if (nextHandler != null){
                nextHandler.handle(request);
            }
        }
    }

    @Override
    public void hasNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
