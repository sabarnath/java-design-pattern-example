package com.sabari.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            intList.add(i);
        }
        long time = System.currentTimeMillis();
        Stream<Integer> sequenceStream = intList.stream();
        Stream<Integer> filterInt = sequenceStream.filter(p -> p>9990);
        filterInt.forEach(p -> System.out.println(p));
        long timeend = System.currentTimeMillis();
        System.out.println("Total elasped time for seq stream :"+ (timeend-time));
        
        time = System.currentTimeMillis();
        Stream<Integer> parraSt = intList.parallelStream();
        Stream<Integer> filterpa5Int = parraSt.filter(p -> p>9990);
        filterpa5Int.forEach(p -> System.out.println(p));
        timeend = System.currentTimeMillis();
        System.out.println("Total elasped time for parallel stream :"+ (timeend-time));
        
        int sum = intList.stream().filter(i -> i>500).mapToInt(i-> i).sum();
        System.out.println("Sum of 1000  after 500 :"+sum);
    }

}
