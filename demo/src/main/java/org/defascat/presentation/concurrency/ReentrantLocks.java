package org.defascat.presentation.concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author andy
 */
public class ReentrantLocks {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();
        
        new Thread(() -> {
            if(lock.tryLock()) {
                System.out.println("Let me be the fourth!");
            }
        }).start();
        System.out.println("Done. Holding " + lock.getHoldCount() + " locks");
    }
}
