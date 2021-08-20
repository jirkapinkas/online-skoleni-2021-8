package cz.skoleni.helloworld;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainThreadSync2 {

    private static int counter;

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        // PROBLEM!!! VYSLEDEK JE VICEMENE NAHODNY!!!
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                lock.lock();
                counter++;
                lock.unlock();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                lock.lock();
                counter--;
                lock.unlock();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join(); // pocka az dobehne vlakno 1
        thread2.join(); // pocka az dobehne vlakno 2

        System.out.println(counter);
    }

}
