package org.defascat.presentation.obsolete;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author andy
 */
public class CachedThreadPool {

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService executor = Executors.newCachedThreadPool();
        Set<Long> threadIds = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 100; i++) {
            executor.submit(() -> threadIds.add(Thread.currentThread().getId()));
        }
        Thread.sleep(1000); 
        System.out.println("Threads used: " + threadIds.size());
        executor.shutdown();
    }
}
