package com.course.java8.title7.stream;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.summingLong;

public class StreamsConModelos {
    
    public static void main(String[] args) {
        
        ModelContacto c1 = new ModelContacto("Contacto01", "Ciudad01", "111 11 11 11", LocalDate.of(1999, Month.MARCH, 11));
        ModelContacto c2 = new ModelContacto("Contacto02", "Ciudad02", "222 22 22 22", LocalDate.of(1998, Month.APRIL, 12));
        ModelContacto c3 = new ModelContacto("Contacto03", "Ciudad03", "333 33 33 33", LocalDate.of(1997, Month.MAY, 13));
        ModelContacto c4 = new ModelContacto("Contacto04", "Ciudad04", "444 44 44 44", LocalDate.of(1996, Month.JANUARY, 14));
        ModelContacto c5 = new ModelContacto("Contacto05", "Ciudad05", "555 55 55 55", LocalDate.of(1995, Month.JULY, 15));
        
        List<ModelLlamada> llamadas = Arrays.asList(
                new ModelLlamada(c1, LocalDate.of(2020, Month.MAY, 28), Duration.ofSeconds(125)),
                new ModelLlamada(c2, LocalDate.of(2020, Month.MAY, 30), Duration.ofMinutes(5)),
                new ModelLlamada(c1, LocalDate.of(2020, Month.MAY, 30), Duration.ofMinutes(12)),
                new ModelLlamada(c3, LocalDate.of(2020, Month.MAY, 28), Duration.ofMinutes(3)),
                new ModelLlamada(c2, LocalDate.of(2020, Month.MAY, 29), Duration.ofSeconds(90)),
                new ModelLlamada(c4, LocalDate.of(2020, Month.MAY, 30), Duration.ofSeconds(365)),
                new ModelLlamada(c2, LocalDate.of(2020, Month.JUNE, 1), Duration.ofMinutes(7)),
                new ModelLlamada(c5, LocalDate.of(2020, Month.JUNE, 2), Duration.ofSeconds(315))
        );
        
        // a quienes llame en junio
        System.out.println("¿A quiénes llamé en junio?");
        llamadas.stream()
            .filter(x -> x.getFecha().getMonth() == Month.JUNE)
            .map(x -> x.getContacto().getNombre())  // obtengo un stream de strings
            .distinct()
            .forEach(System.out::println);
        
        // cuandos segundos he hablado en mayo
        System.out.println("\n¿Cuántos segundos he hablado en mayo?");
        Long total = llamadas.stream()
                .filter(x -> x.getFecha().getMonth() == Month.MAY)
                .map(ModelLlamada::getDuracion)
                .collect(summingLong(Duration::getSeconds));
        System.out.println(total);
        
        // otra alternativa para cuántos segundos he hablado en mayo
        System.out.println("\n¿Cuántos segundos he hablado en mayo?");
        Optional<Duration> totalOptional = llamadas.stream()
            .filter(x -> x.getFecha().getMonth() == Month.MAY)
            .map(ModelLlamada::getDuracion)
            .reduce(Duration::plus);    // reduce devuelve o no
        
        totalOptional.ifPresent(duration -> {System.out.println(duration.getSeconds());});
        
        // llame a alguien en Paris
        System.out.println("\n¿Llamé a alguien en Paris?");
        boolean isllamadaEnParis = llamadas.stream()
            .anyMatch(x -> "Paris".equals(x.getContacto().getCiudad()));
        System.out.println(isllamadaEnParis);
        
        // obtener las 3 llamadas más cortas de mayo
        System.out.println("\n¿Cuáles fueron las 3 llamadas más cortas en mayo?");
        llamadas.stream()
            .filter(x -> x.getFecha().getMonth() == Month.MAY)
            .sorted(comparing(ModelLlamada::getDuracion))
            .limit(3)
            .map(x -> x.getDuracion().getSeconds() + " - " + x.getContacto().getNombre())
            .forEach(System.out::println);
        
        // obtener las 3 llamadas más largas de mayo
        System.out.println("\n¿Cuáles fueron las 3 llamadas más largas en mayo?");
        llamadas.stream()
            .filter(x -> x.getFecha().getMonth() == Month.MAY)
            .sorted(comparing(ModelLlamada::getDuracion).reversed())
            .limit(3)
            .map(x -> x.getDuracion().getSeconds() + " - " + x.getContacto().getNombre())
            .forEach(System.out::println);
        
    }
}
