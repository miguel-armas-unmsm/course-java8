package com.course.java8.title6.optional;

import java.util.Optional;

public class EsPresenteApp {
    
    public static void main(String[] args) {
        
        // compruebo la presencia de un valor
        Optional<String> opt = Optional.of("Baeldung");
        System.out.println(opt.isPresent());
        
        opt = Optional.ofNullable(null);
        System.out.println(opt.isPresent());
         
        
        /*
        // a partir de java 11
        Optional<String> opt2 = Optional.of("Baeldung");
        System.out.println(opt.isEmpty());
        
        opt2 = Optional.ofNullable(null);
        System.out.println(opt.isEmpty());
        */
    }
}
