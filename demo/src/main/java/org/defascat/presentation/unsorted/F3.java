package org.defascat.presentation.unsorted;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andy
 */
public class F3 {
    public static void main(String[] args) {
        final Stream<Integer> ints = IntStream.of(10, 20, 30).boxed();
        System.out.println(Optional.of(ints.findFirst()).flatMap(Function.identity()));
    }
}
