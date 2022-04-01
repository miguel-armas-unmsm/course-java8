package com.course.java8.title7.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreacionApp {
    
    public static void main(String[] args) throws IOException {
        
        /****************** creacion desde colecciones ******************/
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<10_000_000; i++) {
            numbers.add((int) Math.round(Math.random()*100));
        }
        // stream
        Stream<Integer> s = numbers.stream();
        
        // parallelStream
        Stream<Integer> sp = numbers.parallelStream();
        
        
        /****************** creacion desde valores ******************/
        Stream.of("Usando", "Stream", "API", "From", "Java8");
        Stream.of("Usando", "Stream", "API", "From", "Java8").parallel();
        
        
        /****************** creacion desde generadores ******************/
        Stream<Integer> integers = Stream.iterate(0, number -> number+2);
        integers.limit(10).forEach(System.out::println);
        
        /*
        Stream fibonacci = Stream.iterate(new int[]{0,1}, 
                t -> new int []{t[1], t[0]+t[1]});
        
        fibonacci.limit(10)
            .map(x -> x[0])
            .forEach(System.out::println);
        */
        
        
        /****************** creacion desde ficheros ******************/
        // Stream<String> fileContent = Files.lines(Paths.get("readme.txt"));
        
        long numLineas = Files.lines(Paths.get("src//com//other//java8//streams//readme.txt"))
            .flatMap(line -> Arrays.stream(line.split(" ")))
            .distinct()
            .count();
        System.out.println(numLineas);
    }
}
