package org.defascat.presentation.unsorted;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * OptionalInt
 * @author andy
 */
public class F1 {
    public static void main(String[] args) {
        final IntStream stream = IntStream.of(10, 20, 30);
        System.out.println(stream.min());
        System.out.println(OptionalInt.class.getSuperclass());
    }
}
