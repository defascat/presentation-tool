package org.defascat.presentation.obsolete;

import java.util.stream.Stream;

public class ParallelMatch {
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, n -> n + 1).parallel()
                .allMatch(n -> {
            System.out.println(n);
            return n < 100;
        }));
    }
}
