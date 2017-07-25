package com.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by GBR8657 on 4/27/2017.
 */
public class LambdaSamples {
    public static void main(String[] args) {

        List<Long> numbers;// = Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers = new ArrayList<>();
        for(long i=0;i<=10000000;i++){
            numbers.add(i);
        }

        // Step1
        /*Consumer<Long> consumer = new Consumer<Long>(){
            public void accept(Integer i){
                System.out.print("\t" + i);
            }
        }; numbers.forEach(consumer);*/
        // Step2
        /*Consumer<Integer> consumer = (Integer i) -> System.out.print("\t" + i);
        numbers.forEach(consumer);*/
        // Step3
        /*Consumer<Integer> consumer = i -> System.out.print("\t" + i);
        numbers.forEach(consumer);*/

        // Step4
        /*numbers.forEach(i -> {
            if(i>10) {
                int sum = 0;
                sum =sum+i;
                //sum += i;
                System.out.print("\t" + sum);
            }
        });*/

        System.out.println("Sum of numbes: " + addNumbersUsingIterator(numbers));
        System.out.println("Sum of numbes: " + addNumbersUsingStream(numbers));
    }

    // This is called sequential program, can't easily be parallelized.
    private static long addNumbersUsingIterator(List<Long> numbers) {
        long startTime = System.currentTimeMillis();
        Iterator<Long> number = numbers.iterator();
        long sum = 0;
        while (number.hasNext()) {
            long num = number.next();
            if (num > 10) {
                sum += num;
            }
        }
        System.out.println("time taken for addNumbersUsingIterator: " + (System.currentTimeMillis() - startTime));
        return sum;
    }
    // Functional programming using lambda.
    private static long addNumbersUsingStream(List<Long> numbers) {
        long startTime = System.currentTimeMillis();
        Long result = numbers.stream().filter(i -> i > 10).mapToLong(i -> i).sum();
        System.out.println("time taken for addNumbersUsingStream: " + (System.currentTimeMillis() - startTime));
        return result;
    }


}
