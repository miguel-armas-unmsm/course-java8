package com.course.java8.title7.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConFuncInterfaceApp {
    
    public static void main(String[] args) {
        
        // toda clase que implemente una coleccion tiene el metodo Stream
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Stream<Integer> numerosStream = numeros.stream();
        
        List<Integer> list = numerosStream.filter(x -> x%2==0)
        .map(x -> x*2)
        .collect(Collectors.toList());
        
        list.forEach(System.out::println);
    }
}
