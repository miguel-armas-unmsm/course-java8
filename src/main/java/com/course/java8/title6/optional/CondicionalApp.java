package com.course.java8.title6.optional;

import java.util.Optional;

public class CondicionalApp {
    
    public static void main(String[] args) {
        
        // antes de Optional
        /* if(name != null) System.out.println(name.length); */
        
        // si hay un valor presente, ejecuta una lógica
        Optional<String> opt = Optional.of("baeldung");
        opt.ifPresent(x -> {
            // System.out.println(x.length());
        });
        
        
        // or else
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElse("john");
        // System.out.println(name);
        
        
        // or else get 
        String nullName2 = null;
        String name2 = Optional.ofNullable(nullName2).orElseGet(() -> "john");
        // System.out.println(name2);
     
    }
}
