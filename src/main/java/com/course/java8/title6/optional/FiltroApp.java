package com.course.java8.title6.optional;

import java.util.Optional;

public class FiltroApp {
    
    public static void main(String[] args) {
     
        System.out.println(priceIsInRange1(new Modem(10.0)));
        System.out.println(priceIsInRange1(new Modem(9.9)));
        System.out.println(priceIsInRange1(new Modem(null)));
        System.out.println(priceIsInRange1(new Modem(15.5)));
        System.out.println(priceIsInRange1(null));
        
        System.out.println("-----------------");
        
        System.out.println(priceIsInRange2(new Modem(10.0)));
        System.out.println(priceIsInRange2(new Modem(9.9)));
        System.out.println(priceIsInRange2(new Modem(null)));
        System.out.println(priceIsInRange2(new Modem(15.5)));
        System.out.println(priceIsInRange2(null));
        
        
    }
    
    public static boolean priceIsInRange1(Modem modem) {
        boolean isInRange = false;

        if (modem != null && modem.getPrice() != null 
          && (modem.getPrice() >= 10 
            && modem.getPrice() <= 15)) {

            isInRange = true;
        }
        return isInRange;
    }
    
    public static boolean priceIsInRange2(Modem modem2) {
     return Optional.ofNullable(modem2)
       .map(Modem::getPrice)
       .filter(p -> p >= 10)
       .filter(p -> p <= 15)
       .isPresent();
    }
    
    public static class Modem {
        private Double price;

        public Modem(Double price) {
            this.price = price;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }
    
    
    
}
