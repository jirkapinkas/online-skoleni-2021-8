package cz.skoleni.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MainThreadFutureGet {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        System.out.println("Start ...");
        List<Future> futures = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            Future<?> future = executorService.submit(() -> sleep(100));
            futures.add(future);
        }
        System.out.println("Vytvorena vlakna ...");

        futures.forEach(future -> futureGet(future));

        System.out.println("... vsechna vlakna dobehla");

        executorService.shutdown();
        boolean result = executorService.awaitTermination(10, TimeUnit.SECONDS);
        if(!result) {
            executorService.shutdownNow();
        }

    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void futureGet(Future future) {
        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
