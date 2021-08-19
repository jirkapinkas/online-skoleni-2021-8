package cz.skoleni.helloworld;

import java.util.List;
import java.util.OptionalInt;

public class MainIntStream {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,0,2,5,4,3,10,2,1,5);

        OptionalInt minOptional = integers.stream()
                .mapToInt(e -> e)
                .min();
        if(minOptional.isPresent()) {
            System.out.println("Minimum = " + minOptional.getAsInt());
        } else {
            System.out.println("Minimum nebylo nalezeno");
        }
    }
}
