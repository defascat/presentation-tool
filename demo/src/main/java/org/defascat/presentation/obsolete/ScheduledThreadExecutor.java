package org.defascat.presentation.obsolete;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        final ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        executor.scheduleAtFixedRate(() -> exec("scheduleAtFixedRate"), 0, 200, TimeUnit.MILLISECONDS);
        executor.scheduleWithFixedDelay(() -> exec("scheduleWithFixedDelay"), 0, 200, TimeUnit.MILLISECONDS);
        Thread.sleep(3000);
        executor.shutdown();
    }

    private static void exec(String text) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {return;}
        System.out.println(text + "\t " + LocalTime.now() + ": Done!");
    }
}
