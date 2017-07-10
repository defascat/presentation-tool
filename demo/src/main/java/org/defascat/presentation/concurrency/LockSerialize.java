package org.defascat.presentation.concurrency;

import java.util.concurrent.locks.ReentrantLock;
import static org.defascat.presentation.util.Util.serializeAndDeserialize;

public class LockSerialize {

    public static void main(String[] args) throws Exception {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        
        serializeAndDeserialize(lock, 
                LockSerialize::tryLock, 
                LockSerialize::tryLock);
    }

    private static void tryLock(ReentrantLock lock) {
        new Thread(() -> System.out.println("Can lock: " + lock.tryLock()))
                .start();
    }
}
