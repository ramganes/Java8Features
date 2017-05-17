package com.example.lambda;

/**
 * Created by GBR8657 on 5/4/2017.
 */
public class HellowWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Welcome to java!");
    }
}
