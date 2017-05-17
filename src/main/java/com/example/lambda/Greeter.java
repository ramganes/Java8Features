package com.example.lambda;

/**
 * Created by GBR8657 on 5/4/2017.
 */
public class Greeter {

    public void greet(Greeting greeting) {
        //System.out.println("Welcome to java!");
        greeting.perform();
    }

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        //Greeting greeting = new HellowWorldGreeting();
        //greeter.greet(greeting);
        // Convert it into lambda and it's kind of implementation of Greeting interface.
        // Lambda expression of Greeting interface
        Greeting lambdaGreeting = () -> System.out.println("Welcome to Java!");
        //greeting.perform();
        lambdaGreeting.perform();

        /*Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Welcome to Java!");
            }
        };*/
    }
}
