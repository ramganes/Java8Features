package com.example.lambda;

/**
 * Created by GBR8657 on 4/28/2017.
 *
 */
public class LambdaBasics {
    /*
    Define Lambda: Lambda expression is just an another function which exists in isolation and doesn't belong to a class.
     also it's first step into functional programming.
    Uses: Just eliminates boiler plate codes in certain scenarios and supports parallel processing in multi core processors.
     */

    // Method contains and executes some code here and it's associated with classes and Objects.
    public void greeting(){
        System.out.println("Welcome to java!");
    }
    public static void main(String args[]){
        LambdaBasics example2 = new LambdaBasics();
        example2.greeting();
    }
    // Lets see how to convert a method into lambda expression.
    // Step 1: Assign a block of code into a variable, possible only in java 8.

    /*greetingMessage = public void greeting(){
        String message = "Welcome to java";
        System.out.println(message);
    }*/
    // Step 2: Lets remove the boiler plate codes which doesn't make sense here.
    // This function is in an isolation which is not belongs to any class.
    // This function is accessible whoever has that variable.
    // Doesn't make sense to have access specifiers.
    // Compiler is smart enout to identify what it return so no need of return type.
    // Again assigning block of code into variable to no need of function name.
    //greetingMessage = () -> System.out.println("Welcome to java!");

    // Step 3: Lets take an example of function with arguments
    /*addNumbers = public int add(int a, int b){
        return a+b;
    }*/
    // If the function has only one line need not give return
    //addNumbers = (int a, int b) -> return a + b;

    // Step 4: Lets take little bit complex one
    /*devideNumber = (int a, int b) -> {
        int result = 0;
        if(b!=0)
            return a/b;
    }*/
}
