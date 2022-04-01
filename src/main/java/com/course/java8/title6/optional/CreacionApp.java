package com.course.java8.title6.optional;

import java.util.Optional;

public class CreacionApp {

    public static void main(String[] args) {
        
        // crear optional vacio
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());  // verifico si hay un valor presente dentro del optional
        
        
        // crear optional con of
        String name = "baeldung";
        Optional<String> opt = Optional.of(name);   // el argumento pasado a of() no puede ser null 
        // Optional<String> optNull = Optional.of(null);
        System.out.println(opt.isPresent());
        
        
        // crear optional si esperamos valores null
        Optional<String> opt2 = Optional.ofNullable(null);  // si es nulo, devuelve optional vacio
        System.out.println(opt2.isPresent());
    }
}
