package com.example.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by GBR8657 on 4/27/2017.
 */
public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers;
        numbers = new ArrayList<>();
        for(int i=0;i<10000;i++){
            numbers.add(i);
        }
        //System.out.println("Sum of numbes: " + addNumbersUsingIterator(numbers));
        System.out.println("Sum of numbes: " + addNumbersUsingStream(numbers));
    }
    // This is called sequential program, can't easily be parallelized.
    private static long addNumbersUsingIterator(List<Integer> numbers) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> number = numbers.iterator();
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

    private static long addNumbersUsingStream(List<Integer> numbers) {
        long startTime = System.currentTimeMillis();
        long result = numbers.stream().filter(i -> i > 10).mapToLong(i -> i).sum();
        System.out.println("time taken for addNumbersUsingStream: " + (System.currentTimeMillis() - startTime));
        return result;
    }
}
