package com.course.java8.title5.compose;

import java.util.function.Function;

public class ComposeApp {
    
    public static void main(String[] args) {
        
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicando x: " + x + "por 3");
            return x*3;
        };
        
        // compose se ejecuta antes del propio metodo
        Function<Integer, Integer> add1MultiplyBy3 = 
                multiplyBy3.compose(y -> {
                    System.out.println("Sumando 1 a: " + y);
                    return y+1;
                });
        
        // andThen se ejecuta despues del propio metodo
        Function<Integer, Integer> toSquaere =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Elevando " + x + "al cuadradp");
                    return x*x;
                });
    
        System.out.println(add1MultiplyBy3.apply(5));
        System.out.println("///////");
        System.out.println(toSquaere.apply(3));
    }
}
