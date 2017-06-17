package org.defascat.presentation.concurrency;

import java.util.Set;

/**
 * @author andy
 */
public class HowMuchThreads {
    public static void main(String[] args) {
        final Set<Thread> threads = Thread.getAllStackTraces().keySet();
        System.out.println(threads.size());
        threads.forEach(HowMuchThreads::printThread);
        threads.forEach(thread -> {
            thread.setDaemon(false);
            printThread(thread);
        });
    }

    private static void printThread(Thread thread) {
        System.out.println(thread.getName()
                + "\tPriority:" + thread.getPriority() + "\tDaemon:" + thread.isDaemon());
    }
}
