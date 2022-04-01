package com.course.java8.title1.lambda;

public class App2 {

    public static void main(String[] args) {
        
        FuncInterface2 fi = (x) -> x + 5;
        System.out.println(fi.incrementar(6));
    }
}
