package cz.skoleni.helloworld;

public class MainThreadSync0 {

    private static int counter;

    public static void main(String[] args) throws InterruptedException {
        // PROBLEM!!! VYSLEDEK JE VICEMENE NAHODNY!!!
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter++;
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter--;
            }
        });
        thread1.start();
        thread2.start();

        thread1.join(); // pocka az dobehne vlakno 1
        thread2.join(); // pocka az dobehne vlakno 2

        System.out.println(counter);
    }

}
