package cz.skoleni.helloworld;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainExecutor {

    public static void main(String[] args) throws InterruptedException {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(() -> {
            while(true) {
                System.out.println("vlakno 1 bezi ...");
                Thread.sleep(1_000);
            }
        });

        executorService.submit(() -> {
            while(true) {
                System.out.println("vlakno 2 bezi ...");
                Thread.sleep(1_000);
            }
        });

        executorService.shutdown();
        boolean result = executorService.awaitTermination(10, TimeUnit.SECONDS);
        if(!result) {
            executorService.shutdownNow();
        }
    }

}
