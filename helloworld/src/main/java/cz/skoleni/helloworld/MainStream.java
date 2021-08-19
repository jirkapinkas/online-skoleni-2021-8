package cz.skoleni.helloworld;

import java.text.Collator;
import java.util.*;

public class MainStream {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(Arrays.asList(
                new Dog("Hafík"),
                new Dog("Ňafík"),
                new Dog("Bóbik"),
                new Dog("Žeryk"),
                new Dog("Áriec")
        ));

//        dogs.sort(Comparator.comparing(Dog::getName, Collator.getInstance(Locale.forLanguageTag("CS_cz"))));
//        dogs.forEach(System.out::println);

        // Co chceme: utridit pejsky & vypsat jejich jmena
        dogs.stream()
                // pred prave jednou terminalni operaci, ktera je na konci muze byt mnoho intermediate operaci
                .sorted(Comparator.comparing(Dog::getName, Collator.getInstance(Locale.forLanguageTag("CS_cz"))))
                .map(Dog::getName) // operace "map" transformuje prvek ve streamu
                .forEach(System.out::println); // terminalni operace (na konci streamu JE PRAVE JEDNA TERMINALNI OPERACE)
    }

}
