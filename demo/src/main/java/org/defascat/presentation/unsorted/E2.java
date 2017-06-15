package org.defascat.presentation.unsorted;

import java.util.stream.Stream;

/**
 *
 * @author andy
 */
public class E2 {
    public static void main(String[] args) {
        Stream.generate(() -> "test")
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
