package org.defascat.presentation.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ProgrammerRoulette {
    private static volatile int i = 0; 
    private static final int LIMIT = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService executor = Executors.newFixedThreadPool(8);
        IntStream.range(0, LIMIT)
                .forEach(a -> executor.submit(() -> i++));
        Thread.sleep(2000);
        executor.shutdown();
        System.out.println("Lost: " + (LIMIT - i) + " of " + LIMIT);
    }
}
