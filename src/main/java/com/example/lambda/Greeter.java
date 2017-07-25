package com.example.lambda;

/**
 * Created by GBR8657 on 5/4/2017.
 */
public class Greeter {

    public static Greeting lambdaGreeting;
    public void greet() {
        //System.out.println("Welcome to java!");
        //greeting.perform();
        lambdaGreeting.perform();
    }

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        lambdaGreeting = () -> System.out.println("Welcome to Java!");
        //Greeting greeting = new HellowWorldGreeting();
        //greeter.greet(greeting);
        greeter.greet();
        // Convert it into lambda and it's kind of implementation of Greeting interface.
        // Lambda expression of Greeting interface

        //greeting.perform();

        /*Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Welcome to Java!");
            }
        };*/
    }

}
