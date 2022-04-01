package com.course.java8.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapApp {

    private Map<Integer, String> map;
    
    public void poblar() {
        map = new HashMap<>();
        map.put(1, "Mito");
        map.put(2, "Code");
        map.put(3, "Suscribete");
    }
    
    public void imprimir_v7() {
        for(Entry<Integer, String> e: map.entrySet()) {
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }
    
    public void imprimir_v8() {
        // map.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }
    
    public void recolectar() {
        Map<Integer, String> mapaRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("o"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        mapaRecolectado.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }
    
    public void insertarSiAusente() {
        // map.putIfAbsent(4, "Jaime");
        map.putIfAbsent(2, "Jaime");    // inserta solo si no se repite el key
    }
    
    public void operarSiPresente() {
        map.computeIfPresent(3, (k,v) -> k + v);
        System.out.println(map.get(3));
    }
    
    public void obtenerOrPredeterminado() {
        String valor = map.getOrDefault(5, "Valor por defecto");    // devuelve el valor por defecto si no existe en el map
        System.out.println(valor);
    }
    
    public static void main(String[] args) {
        HashMapApp app = new HashMapApp();
        app.poblar();
        // app.imprimir_v7();
        // app.insertarSiAusente();
        // app.imprimir_v8();
        // app.operarSiPresente();
        // app.obtenerOrPredeterminado();
        app.recolectar();
    }
}
