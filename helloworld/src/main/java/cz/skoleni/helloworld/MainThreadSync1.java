package cz.skoleni.helloworld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MainThreadSync1 {

    // RESENI CISLO 1: Misto "int" pouzit "AtomicInteger"
    private static AtomicInteger counter = new AtomicInteger();

    // RESENI PRO DATOVE STRUKTURY:
    private static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incrementAndGet();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.decrementAndGet();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join(); // pocka az dobehne vlakno 1
        thread2.join(); // pocka az dobehne vlakno 2

        System.out.println(counter.get());
    }

}
