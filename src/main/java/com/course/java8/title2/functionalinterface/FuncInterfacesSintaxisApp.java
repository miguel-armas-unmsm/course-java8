package com.course.java8.title2.functionalinterface;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class FuncInterfacesSintaxisApp {

    Function<Integer, String> addCeros = x -> x<10 ? "0" + x : String.valueOf(x);
    
    TriFunction<Integer, Integer, Integer, LocalDate> parseDate = 
            (day, month, year) -> LocalDate.parse(year + "-" + 
                    addCeros.apply(month) + "-" + addCeros.apply(day));
    
    TriFunction<Integer, Integer, Integer, Integer> calculateAge = 
            (day, month, year) -> Period.between(
                    LocalDate.now(), parseDate.apply(day, month, year)
                    ).getYears();   
    
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
