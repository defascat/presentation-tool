package org.defascat.presentation.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Programmer roulette
 * @author andy
 */
public class ProgrammerRoulette {
    private static volatile int i = 0; 
    private static final int LIMIT = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService executor = Executors.newFixedThreadPool(8);
        for (int j = 0; j < LIMIT; j++) {
            executor.submit(() -> i++);
        }
        Thread.sleep(2000);
        executor.shutdown();
        System.out.println("Got:" + i + "; Lost: " + (LIMIT - i));
    }
}
