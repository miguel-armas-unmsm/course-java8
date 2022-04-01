package com.course.java8.title3.methodreference.staticmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Number {

  public static boolean isMoreThanFifty(int n1, int n2) {
    return (n1 + n2) > 50;
  }

  public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {

    List<Integer> list = new ArrayList<>();
    for (Integer i : l) {
      if (p.test(i, i + 10))
        list.add(i);
    }
    return list;
  }


}
