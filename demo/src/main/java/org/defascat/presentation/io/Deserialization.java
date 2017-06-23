package org.defascat.presentation.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author andy
 */
public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            System.out.println("Serialization");
            oos.writeObject(new B());
            oos.flush();
            byte[] bytes = baos.toByteArray();
            try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                    ObjectInputStream ois = new ObjectInputStream(bais)) {
                System.out.println("Deserialization");
                ois.readObject();
            }
        }
    }

    static class A {
        public A() {
            System.out.println("In A");
        }
    }

    static class B extends A implements Serializable {
        public B() {
            System.out.println("In B");
        }
    }
}
