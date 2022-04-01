package com.course.java8.title6.optional;

import java.util.Optional;

public class MapApp {
    
    public static void main(String[] args) {
        
        // ejemplo 1
        String name = "baeldung";
        Optional<String> nameOptional = Optional.of(name);

        int len = nameOptional
         .map(String::length)
         .orElse(0);
        System.out.println(len);

        
        
        // ejemplo 2
        String password = " password ";
        Optional<String> passOpt = Optional.of(password);
        
        boolean correctPassword = passOpt.filter(
          pass -> pass.equals("password")).isPresent();
        System.out.println(correctPassword);

        correctPassword = passOpt
          .map(String::trim)
          .filter(pass -> pass.equals("password"))
          .isPresent();
        System.out.println(correctPassword);
    }
}
