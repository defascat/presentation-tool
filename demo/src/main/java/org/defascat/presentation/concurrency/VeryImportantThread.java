package org.defascat.presentation.concurrency;

public class VeryImportantThread {
    public static void main(String[] args) {
        final Thread VIT = new Thread(() -> {
            System.out.println("I'm a very important thread!");
        });
        VIT.setPriority(Thread.MAX_PRIORITY * 10);
        VIT.start();
    }
}
