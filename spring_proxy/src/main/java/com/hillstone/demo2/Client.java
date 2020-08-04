package com.hillstone.demo2;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //userService.add();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
        System.out.println("-----------------");
        proxy.update();

    }
}
