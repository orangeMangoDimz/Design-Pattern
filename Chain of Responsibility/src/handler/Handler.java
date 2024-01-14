package handler;

import model.Request;

public abstract class Handler {
    public abstract void handle(Request request);
    public abstract void hasNextHandler(Handler handler);
}
