package org.defascat.presentation.concurrency;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Serialized lock
 *
 * @author andy
 */
public class LockSerialize implements Serializable {

    private static <T> T serializeAndDeserialize(T in) throws IOException, ClassNotFoundException {
        try (PipedOutputStream pos = new PipedOutputStream();
                PipedInputStream pis = new PipedInputStream()) {
            pos.connect(pis);
            try (ObjectOutputStream objOutStream = new ObjectOutputStream(pos);
                    ObjectInputStream objInStream = new ObjectInputStream(pis)) {
                objOutStream.writeObject(in);
                return (T) objInStream.readObject();
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        tryLock(lock);
        
        final ReentrantLock copiedLock = serializeAndDeserialize(lock);
        tryLock(copiedLock);
    }

    private static void tryLock(ReentrantLock lock) {
        new Thread(() -> {
            final boolean tryLockResult = lock.tryLock();
            System.out.println("Can lock: " + tryLockResult);
        }).start();
    }
}
