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

public class MainSort {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>(Arrays.asList(
                new Dog("Hafík"),
                new Dog("Ňafík"),
                new Dog("Bóbik"),
                new Dog("Žeryk"),
                new Dog("Áriec")
        ));
        Collections.sort(dogs, new DogComparator());
        System.out.println(dogs);
    }

}
