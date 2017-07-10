package org.defascat.presentation.io;

import java.io.IOException;
import java.io.Serializable;
import org.defascat.presentation.util.Util;

public class Deserialization2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Util.serializeAndDeserialize(new B(),
                Util::printClass,
                Util::printClass);
    }

    static class A {
        public A(int i) {
            System.out.println("In A: i = " + i);
        }
    }

    static class B extends A implements Serializable {
        public B() {
            super(23);
            System.out.println("In B");
        }
    }
}
