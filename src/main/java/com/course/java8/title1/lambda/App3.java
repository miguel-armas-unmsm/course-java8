package com.course.java8.title1.lambda;

public class App3 {
    
    public static void main(String[] args) {
        
        FuncInterface3 fi = (a,b) -> {
            return a+" - "+b;
        };
        
        System.out.println(fi.concatenar("first", "second"));
    }
}
