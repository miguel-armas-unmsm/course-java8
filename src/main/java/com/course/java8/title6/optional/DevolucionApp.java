package com.course.java8.title6.optional;

import java.util.Optional;

public class DevolucionApp {
    
    public static void main(String[] args) {
        
        // get
        Optional<String> opt = Optional.of("baeldung"); 
        String name = opt.get();    // solo devuelve si no es nulo
        System.out.println(name);
        
        Optional<String> opt2 = Optional.ofNullable(null);
        String name2 = opt2.get();
        System.out.println(name2);
        // este enfoque va en contra de los objetivos de Optional y probablemente quedará obsoleto
        
    }
}
