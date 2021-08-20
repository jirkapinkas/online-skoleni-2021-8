package cz.skoleni.helloworld;

public class MainThreadSync3 {

    private static int counter;

    private static Object[] lock = new Object[] {};

    public static void inc() {
        synchronized (lock) {
            counter++;
        }
    }

    public static void dec() {
        synchronized (lock) {
            counter--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // PROBLEM!!! VYSLEDEK JE VICEMENE NAHODNY!!!
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                inc();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                dec();
            }
        });
        thread1.start();
        thread2.start();

        thread1.join(); // pocka az dobehne vlakno 1
        thread2.join(); // pocka az dobehne vlakno 2

        System.out.println(counter);
    }

}
