package org.defascat.presentation.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Uses LinkedBlockingQueue#offer
 * Decompile to see how final works
 * @author andy
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> System.out.println("Start"));
        for (int i = 0; i < 10; i++) {
            int k = i; // Why?
            executor.submit(() -> System.out.println(k));
        }
        executor.submit(() -> System.out.println("End"));
        executor.shutdown(); // What if comment this line?
    }
}
