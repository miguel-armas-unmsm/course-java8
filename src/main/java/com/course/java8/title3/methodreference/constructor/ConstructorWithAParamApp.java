package com.course.java8.title3.methodreference.constructor;

import java.util.function.Function;

public class ConstructorWithAParamApp {

  public static void main(String[] args) {

    // Using an anonymous class
    Function<String, Integer> f
        = new Function<String, Integer>() {
      public Integer apply(String s) {
        return new Integer(s);
      }
    };
    Integer i = f.apply("100");

    // Using a lambda expression
    Function<String, Integer> f1 = s -> new Integer(s);
    Integer i1 = f1.apply("100");

    // Using a method reference
    Function<String, Integer> f2 = Integer::new;
    Integer i2 = f2.apply("100");

  }
}
