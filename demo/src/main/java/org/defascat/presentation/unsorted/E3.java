package org.defascat.presentation.unsorted;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 *
 * @author andy
 */
public class E3 {
    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();
        Stream.generate(() -> "test" + i.incrementAndGet())
                .peek(System.out::println)
                .filter(s -> s.length() > 10)
                .limit(3)
                .forEach(System.out::println);
    }
}
