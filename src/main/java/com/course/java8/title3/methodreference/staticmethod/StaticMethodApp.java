package com.course.java8.title3.methodreference.staticmethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class StaticMethodApp {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

    // usando clase anonima
    List<Integer> ls = Number.findNumbers(list, new BiPredicate<Integer, Integer>() {
      public boolean test(Integer i1, Integer i2) {
        return Number.isMoreThanFifty(i1, i2);}
    });
    ls.forEach(System.out::println);

    // usando una expresion lambda
    ls = Number.findNumbers(list, (i1, i2) -> Number.isMoreThanFifty(i1, i2));
    ls.forEach(System.out::println);

    // usando referencia a metodo
    ls = Number.findNumbers(list, Number::isMoreThanFifty);
    ls.forEach(System.out::println);
  }
}
