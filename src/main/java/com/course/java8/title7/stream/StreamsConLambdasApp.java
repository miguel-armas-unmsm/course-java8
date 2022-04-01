package com.course.java8.title7.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConLambdasApp {
    
    public static void main(String[] args) {
        
        // toda clase que implemente una coleccion tiene el metodo Stream
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Stream<Integer> numerosStream = numeros.stream();
        
        // encadeno operaciones utilizando interfaces funcionales 
        numerosStream.filter(new Predicate<Integer>(){
            @Override
            public boolean test(Integer numero){
                return numero%2==0;
            }
        }).map(new Function<Integer, Integer>(){
            @Override
            public Integer apply(Integer numero){
                return numero*2;
            }
        });
        
        // recojo los datos filtrados en una coleccion
        List<Integer> list = numerosStream.collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
