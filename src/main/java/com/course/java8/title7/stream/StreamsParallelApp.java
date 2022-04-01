package com.course.java8.title7.stream;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class StreamsParallelApp {
    
    public static void main(String[] args) {
        
        // lleno el arraylist
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<10_000_000; i++) {
            numbers.add((int) Math.round(Math.random()*100));
        }
        
        // test secuencial
        System.out.println("Test secuencial -------------------------");
        for (int i=0; i<10; i++) {
            long start = System.currentTimeMillis();
            List<Integer> even = numbers.stream()
                .filter(n -> n%2 ==0)
                .sorted()
                .collect(toList());
            
            System.out.printf(
                    "%d elementos computados en %5d msecs con %d threads\n",
                    even.size(),
                    System.currentTimeMillis() - start,
                    Thread.activeCount()
            );
        }
        
        // test paralelo
        System.out.println("\nTest paralelo -------------------------");
        for (int i=0; i<10; i++) {
            long start = System.currentTimeMillis();
            List<Integer> even = numbers.parallelStream()
                .filter(n -> n%2 ==0)
                .sorted()
                .collect(toList());
            
            System.out.printf(
                    "%d elementos computados en %5d msecs con %d threads\n",
                    even.size(),
                    System.currentTimeMillis() - start,
                    Thread.activeCount()
            );
        }
        
    }
}
