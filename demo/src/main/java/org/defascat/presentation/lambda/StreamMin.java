package org.defascat.presentation.lambda;

import java.util.stream.IntStream;

public class StreamMin {
    public static void main(String[] args) {
        final IntStream stream = IntStream.of(10, 20, 30);
        final Object min = stream.min();
        System.out.println(min);
        System.out.println(min.getClass());
        System.out.println(min.getClass().getSuperclass());
    }
}
