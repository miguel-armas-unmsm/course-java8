package com.course.java8.title1.lambda;

public class App1 {
    
    public static void main(String[] args) {
        
        FuncInterface1 helloWorld = () -> "Hello, world!";
       
        System.out.println(helloWorld.saludar());
    }
}
