package cz.skoleni.helloworld;

public class MainThread {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> {
//            for (int i = 0; i < 10_000; i++) {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("vlakno 1 bezi ...");
            }
        };

        Runnable runnable2 = () -> {
//            for (int i = 0; i < 10_000; i++) {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("vlakno 2 bezi ...");
            }
        };

        Thread thread1 = new Thread(runnable1, "Operace 1");
        Thread thread2 = new Thread(runnable2, "Operace 2");
        thread1.start();
        thread2.start();
//        Thread.sleep(1);
        System.out.println("Vlakna vytvorena");
    }

}
