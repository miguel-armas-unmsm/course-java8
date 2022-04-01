package com.course.java8.title3.methodreference.existingobject;

import com.course.java8.title3.methodreference.existingobject.model.Car;
import com.course.java8.title3.methodreference.existingobject.model.Mechanic;

import java.util.function.Consumer;

public class ExistingObjectApp {

  public static void execute(Car car, Consumer<Car> c) {
    c.accept(car);
  }

  public static void main(String[] args) {

    // variable final
    final Mechanic mecanico = new Mechanic();
    Car car = new Car();

    // Using an anonymous class
    execute(car, new Consumer<Car>() {
      public void accept(Car c) {
        mecanico.reparar(c);
      }
    });

    // Using a lambda expression
    execute(car, c -> mecanico.reparar(c));

    // Using a method reference
    execute(car, mecanico::reparar);
  }
}
