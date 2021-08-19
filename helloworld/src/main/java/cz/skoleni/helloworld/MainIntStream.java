package cz.skoleni.helloworld;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class MainIntStream {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,0,2,5,4,3,10,2,1,5);

        OptionalInt minOptional = integers.stream()
                .mapToInt(Integer::valueOf)
//                .mapToInt(e -> e)
                .min();
        if(minOptional.isPresent()) {
            System.out.println("Minimum = " + minOptional.getAsInt());
        } else {
            System.out.println("Minimum nebylo nalezeno");
        }

        List<String> strings = List.of("1","2","3");
        strings.stream()
                .mapToInt(Integer::valueOf)
                .forEach(System.out::println);
    }
}

