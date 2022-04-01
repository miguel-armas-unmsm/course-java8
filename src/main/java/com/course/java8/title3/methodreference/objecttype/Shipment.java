package com.course.java8.title3.methodreference.objecttype;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Shipment {

  public double calcularPeso() {
    double peso = 0;
    // calculo
    return peso;
  }

  public List<Double> calcularEnEnvio(List<Shipment> l, Function<Shipment, Double> f) {

    List<Double> results = new ArrayList<>();
    for (Shipment e : l) {
      results.add(f.apply(e));
    }
    return results;
  }
}
