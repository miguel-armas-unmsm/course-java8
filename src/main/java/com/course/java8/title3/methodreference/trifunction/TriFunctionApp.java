package com.course.java8.title3.methodreference.trifunction;

public class TriFunctionApp {

  public static void main(String[] args) {

    // clase anonima
    TriFunction<Sum, String, String, Integer> anon =
        new TriFunction<Sum, String, String, Integer>() {

          public Integer apply(Sum s, String arg1, String arg2){
            return s.doSum(arg1, arg2);
          }
        };
    System.out.println(anon.apply(new Sum(), "1", "4"));

    // expresiones lambda
    TriFunction<Sum, String, String, Integer> lambda =
        (Sum s, String arg1, String arg2) -> s.doSum(arg1, arg2);
    System.out.println(lambda.apply(new Sum(), "1", "4"));

    // referencia a metodo
    TriFunction<Sum, String, String, Integer> mRef = Sum::doSum;
    System.out.println(mRef.apply(new Sum(), "1", "4"));
  }
}
