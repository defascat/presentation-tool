package org.defascat.presentation.concurrency;

public class FinalRabbitHole {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int k = i;
            new Runnable() {
                public void run() {
                    System.out.println(k);
                }
            }.run();
        }
    }
}
