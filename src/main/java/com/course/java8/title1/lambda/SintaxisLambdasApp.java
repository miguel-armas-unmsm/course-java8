package com.course.java8.title1.lambda;

//import _06_reference_operator.NombresUtils;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class SintaxisLambdasApp {
    
    public static void main(String[] args) {
        
        List<String> cursos = getList("Java", "Functional");
        cursos.forEach(curso -> System.out.println(curso));
        
        usarZero(() -> 2);
        usarPredicado( text -> text.isEmpty());
        usarBiFunction( (x,y) -> x*y);
        usarBiFunction( (Integer x, Integer y) -> x-y);
        
        usarBiFunction( (x,y) -> {
            System.out.println("X: " + x + "\nY: " +y);
            return x-y;
        });

        usarNada( () -> {
            System.out.println("Nothing");
        });
    }
    
    static void usarZero(ZeroArgumentos zeroArgumentos){}
    static void usarPredicado(Predicate<String> predicado){}
    static void usarBiFunction(BiFunction<Integer, Integer, Integer> biFuncion){}
    static void usarNada(OperaNada operaNada){}    
    
    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }
    
    @FunctionalInterface
    interface OperaNada {
        void nada();
    }
    
    public static <T> List<T> getList(T... elements){
        // asList transforma un array en un List
        return Arrays.asList(elements);
    }
}
