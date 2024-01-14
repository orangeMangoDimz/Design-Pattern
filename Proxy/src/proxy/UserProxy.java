package proxy;

public class UserProxy implements Proxy{
    @Override
    public boolean login(String username, String password) {
        return username.equals("Dimas") && password.equals("123");
    }
}
