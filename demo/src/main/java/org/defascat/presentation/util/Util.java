package org.defascat.presentation.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Util {
    public static void writeBytes(SupplierWithIO<OutputStream> supplier, byte[] bytes) throws IOException {
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

    public static <T> void serializeAndDeserialize(T objToWrite, Consumer<T> onWriteConsumer, Consumer<T> onReadConsumer) throws ClassNotFoundException, IOException {
        try (final ByteArrayOutputStream baos = new ByteArrayOutputStream();final ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            System.out.println("Serialization");
            onWriteConsumer.accept(objToWrite);
            oos.writeObject(objToWrite);
            oos.flush();
            byte[] bytes = baos.toByteArray();
            try (final ByteArrayInputStream bais = new ByteArrayInputStream(bytes);final ObjectInputStream ois = new ObjectInputStream(bais)) {
                System.out.println("\nDeserialization");
                final Object readObject = ois.readObject();
                onReadConsumer.accept((T) readObject);
            }
        }
    }

    public static void printClass(Object obj) {
        System.out.println(obj.getClass());
    }

    public static void printMethods(Method[] methods) {
        System.out.println("---- Methods ----");
        for (Method method : methods) {
            System.out.println(method.getReturnType().getName() + " " + method.getName());
        }
    }
    
    public interface SupplierWithIO<T> {
        public T getWithIO() throws IOException;
    }
}
