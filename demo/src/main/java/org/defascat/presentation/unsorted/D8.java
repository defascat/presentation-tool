package org.defascat.presentation.unsorted;

import java.util.stream.Stream;

/**
 * How stream count works
 * @author andy
 */
public class D8 {
    public static void main(String[] args) {
        // System.out.println(Stream.iterate(1, n -> n + 1).count());
        // System.out.println(Stream.iterate(1, n -> n + 1).min(Integer::compare));
        // System.out.println(Stream.iterate(1, n -> n + 1).max(Integer::compare));
        // System.out.println(Stream.iterate(1, n -> n + 1).findAny());
        System.out.println(Stream.iterate(1, n -> n + 1).parallel().allMatch(n -> {
            System.out.println(n);
            return n < 100;
        })); // Why 1025?
    }
}
