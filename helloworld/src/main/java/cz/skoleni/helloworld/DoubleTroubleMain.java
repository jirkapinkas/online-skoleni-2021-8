package cz.skoleni.helloworld;

import java.math.BigDecimal;

public class DoubleTroubleMain {

    public static void main(String[] args) {
        System.out.println("0.1 + 0.2 = " + (0.1 + 0.2));

        // Reseni:

        // A) Pouzivat BigDecimal
        // Vyhoda: Easy :-)
        // Nevyhoda: Pomalejsi & pracujeme s objekty
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        System.out.println("0.1 + 0.2 = " + a.add(b).doubleValue());

        // B) Po operaci napr. 0.1 + 0.2 vysledek zaokrouhlit!!!
        // Vyhoda: Rychle
        // Nevyhoda: Pracujeme s presnosti na X desetinnych mist
        System.out.println("0.1 + 0.2 = " + Math.round((0.1 + 0.2) * 100.0) / 100.0);
    }

}
