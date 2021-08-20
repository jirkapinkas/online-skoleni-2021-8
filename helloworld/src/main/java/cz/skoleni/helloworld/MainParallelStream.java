package cz.skoleni.helloworld;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainParallelStream {

    public static void main(String[] args) {
        // microbenchmarking se spravne dela pomoci JMH (Java Microbenchmark Harness)
        // https://www.baeldung.com/java-microbenchmark-harness
        // http://tutorials.jenkov.com/java-performance/jmh.html

        // Parallel stream pouziva pool vlaken,
        // ktery je jeden per jedna instance JVM

        // Pocet vlaken v poolu vlaken parallelniho streamu:
        // "POCET JADER PROCESORU - 1"

        long millis = System.currentTimeMillis();
        String string = IntStream.range(0, 100)
                .parallel()
                .filter(e -> e % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(System.currentTimeMillis() - millis);
        System.out.println(string);

        IntStream.range(0, 100)
                .parallel()
                .forEach(i -> {
                    System.out.println("sending email .... " + i);
                });
    }

}
