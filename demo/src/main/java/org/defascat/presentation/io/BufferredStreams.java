package org.defascat.presentation.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.lang.RandomStringUtils;

public class BufferredStreams {

    public interface SupplierWithIO<T> {
        public T getWithIO() throws IOException;
    }

    public static void main(String[] args) throws IOException {
        String str = RandomStringUtils.random(1_000_000);
        final byte[] bytes = str.getBytes();
        processStream(() -> new FileOutputStream("bufferred.txt"), bytes);
        processStream(() -> new BufferedOutputStream(new FileOutputStream("bufferred.txt")), bytes);
    }

    private static void processStream(SupplierWithIO<OutputStream> supplier, byte[] bytes) throws IOException {
        long t1 = System.currentTimeMillis();
        try (OutputStream out = supplier.getWithIO()) {
            System.out.print(out.getClass().getName() + ": ");
            for (byte b : bytes) {
                out.write(b);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        long t2 = System.currentTimeMillis();
        System.out.println((t2 - t1) + " ms");
    }

}
