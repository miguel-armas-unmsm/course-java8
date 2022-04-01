package com.course.java8.title4.chaining;

public class ChainingApp {

  /**
   * Los chainer methods retornan el mismo objeto para seguir ejecutando sus métodos sin necesidad de guardar datos
   * aislados en alguna variable.
   */
  static class Chainer {

    public Chainer sayHello() {
      System.out.println("Hello");
      return this;
    }

    public Chainer sayGoodBye() {
      System.out.println("Good bye");
      return this;
    }
  }

  public static void main(String[] args) {

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hello ").append("wolrd").append("!!");

    Chainer chainer = new Chainer();
    chainer.sayGoodBye().sayHello();
  }
}
