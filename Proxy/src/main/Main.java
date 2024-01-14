package main;

import model.User;
import proxy.Proxy;
import proxy.UserProxy;

public class Main {
    public static void main(String[] args) {
        User user = new User("Dimas", "321");
        Proxy proxy = new UserProxy();
        boolean success = proxy.login(user.getName(), user.getPassword());
        if (success) {
            System.out.println("User valid");
        } else {
            System.out.println("User not valid");
        }
    }
}
