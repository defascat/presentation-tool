package org.defascat.presentation.io;

import java.io.IOException;
import java.io.Serializable;
import org.defascat.presentation.util.Util;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Util.serializeAndDeserialize(new B(),
                Util::printClass,
                Util::printClass);
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
