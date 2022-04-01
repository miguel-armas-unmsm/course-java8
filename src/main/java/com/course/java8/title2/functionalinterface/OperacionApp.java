package com.course.java8.title2.functionalinterface;

public class OperacionApp {
  
    public double operar(double x, double y) {
        OperacionFI op = (n1, n2) -> n1 + n2;
        return op.calcular(x,y);
    }
    
    public static void main(String[] args) {
        OperacionApp app = new OperacionApp();
        double rpta = app.operar(2, 3);
        System.out.println(rpta);
    }
}
