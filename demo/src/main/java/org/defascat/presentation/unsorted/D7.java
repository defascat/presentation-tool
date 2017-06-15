package org.defascat.presentation.unsorted;

import java.util.stream.Stream;

/**
 * Debug stream
 * @author andy
 */
public class D7 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.limit(2).forEach(System.out::println);
    }
}
