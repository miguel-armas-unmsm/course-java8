package com.course.java8.title3.methodreference.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ConstructorWithoutParamApp {

  public static void main(String[] args) {

    // Using an anonymous class
    Supplier<List<String>> s = new Supplier() {
      public List<String> get() {
        return new ArrayList<String>();
      }
    };
    List<String> l = s.get();

    // Using a lambda expression
    Supplier<List<String>> s1 = () -> new ArrayList<String>();
    List<String> l1 = s.get();

    // Using a method reference
        /*
        Supplier<List::new;
        List<String> l2 = s.get();
        */
  }
}
