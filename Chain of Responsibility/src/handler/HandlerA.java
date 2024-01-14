package handler;

import model.Request;

public class HandlerA extends Handler{
    private Handler nextHandler;
    @Override
    public void handle(Request request) {
        System.out.println("HandlerA is handling the request ...");
        if (request.getContent().contains("Dimas")){
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
