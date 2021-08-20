package cz.skoleni.helloworld;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainExecutorSendingEmails {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            executorService.submit(() -> {
                System.out.println("TODO POSILA SE EMAIL ... " + finalI);
            });
        }

        executorService.shutdown();
        boolean result = executorService.awaitTermination(1, TimeUnit.MINUTES);
        if(!result) {
            executorService.shutdownNow();
        }
    }

}
