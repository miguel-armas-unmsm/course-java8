package com.course.java8.title3.methodreference.objecttype;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ObjectTypeApp {

  public static void main(String[] args) {

    List<Shipment> l = new ArrayList<>();

    // usando clase anonima
    Shipment e = new Shipment();
    List<Double> enEnvio = e.calcularEnEnvio(l, new Function<Shipment, Double>() {
      public Double apply(Shipment e) {
        return e.calcularPeso();
      }
    });
    enEnvio.forEach(System.out::println);

    // usando expresion lambda
    enEnvio = e.calcularEnEnvio(l, s -> s.calcularPeso());
    enEnvio.forEach(System.out::println);

        /*
        // usando referencia a metodo
        enEnvio = e.calcularEnEnvio(l, Envio::calcularEnEnvio);
        enEnvio.forEach(System.out::println);
        */
  }
}
