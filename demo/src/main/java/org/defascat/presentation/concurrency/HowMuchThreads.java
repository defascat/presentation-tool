package org.defascat.presentation.concurrency;

import java.util.Set;

public class HowMuchThreads {
    public static void main(String[] args) {
        final Set<Thread> threads = Thread.getAllStackTraces().keySet();
        System.out.println("Threads :" + threads.size());
        threads.forEach(HowMuchThreads::printThread);
    }

    private static void printThread(Thread thread) {
        System.out.println(thread.getName()
                + "\tPriority: " + thread.getPriority() 
                + "\tDaemon: " + thread.isDaemon());
    }
}
