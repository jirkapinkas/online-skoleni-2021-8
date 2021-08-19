package cz.skoleni.helloworld;

import java.text.Collator;
import java.util.*;

class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        Collator czCollator = Collator.getInstance(Locale.forLanguageTag("CS_cz"));
        return czCollator.compare(o1.getName(), o2.getName());
//        return o1.getName().compareTo(o2.getName());
    }
}

public class MainSortLambdaMethodReference {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(Arrays.asList(
                new Dog("Hafík"),
                new Dog("Ňafík"),
                new Dog("Bóbik"),
                new Dog("Žeryk"),
                new Dog("Áriec")
        ));
        // 1. varianta: Custom trida, ktera implementuje Comparator
//        Collections.sort(dogs, new DogComparator());

        // 2. varianta: vnitrni anonymni trida
        Collections.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                Collator czCollator = Collator.getInstance(Locale.forLanguageTag("CS_cz"));
                return czCollator.compare(o1.getName(), o2.getName());
            }
        });

        // 3. varianta: Od Java 8: lambda (kdyz ma interface PRAVE JEDNU ABSTRAKTNI METODU!!!)
        Collections.sort(dogs, (Dog o1, Dog o2) -> {
            Collator czCollator = Collator.getInstance(Locale.forLanguageTag("CS_cz"));
            return czCollator.compare(o1.getName(), o2.getName());
        });

        // 4. varianta: Od Java 8: lambda II.
        Collections.sort(dogs, (o1, o2) -> {
            Collator czCollator = Collator.getInstance(Locale.forLanguageTag("CS_cz"));
            return czCollator.compare(o1.getName(), o2.getName());
        });

        // 5. varianta: Od Java 8: sort() je take na Listu!
        dogs.sort((o1, o2) -> {
            Collator czCollator = Collator.getInstance(Locale.forLanguageTag("CS_cz"));
            return czCollator.compare(o1.getName(), o2.getName());
        });

        // 5. varianta: Od Java 8: sort()
        dogs.sort(Comparator.comparing(Dog::getName, Collator.getInstance(Locale.forLanguageTag("CS_cz"))));

        // Do Java 8
//        for (Dog dog : dogs) {
//            System.out.println(dog);
//        }

        // Od Java 8: Nejslozitejsi lambda :-)
//        dogs.forEach(dog -> {
//            System.out.println(dog);
//        });

        // Od Java 8: Jednoradkova lambda
//        dogs.forEach(dog -> System.out.println(dog));

        // Od Java 8: Method reference
        dogs.forEach(System.out::println);
    }

}

@FunctionalInterface
interface I {
    void test();
    static void test2() {

    }
    default void test3() {

    }
}