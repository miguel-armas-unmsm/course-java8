package com.course.java8.title3.methodreference.constructor;

import java.util.Locale;
import java.util.function.BiFunction;

public class ConstructorWithTwoParamsApp {

  public static void main(String[] args) {
    // Using a anonymous class
    BiFunction<String, String, Locale> f = new BiFunction<String, String, Locale>() {
      public Locale apply(String lang, String country) {
        return new Locale(lang, country);
      }
    };
    Locale loc = f.apply("en", "UK");

    // Using a lambda expression
    BiFunction<String, String, Locale> f1 = (lang, country) -> new Locale(lang, country);
    Locale loc1 = f.apply("en", "UK");

    // Using a method reference
    BiFunction<String, String, Locale> f2 = Locale::new;
    Locale loc2 = f2.apply("en", "UK");
  }
}
