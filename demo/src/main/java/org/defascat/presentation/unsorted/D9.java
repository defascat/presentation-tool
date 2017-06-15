package org.defascat.presentation.unsorted;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author andy
 */
public class D9 {
    public static void main(String[] args) {
        final Stream<Integer> stream = Stream.iterate(1, n -> n + 1).limit(100);
        stream.collect(Collectors.toCollection(TreeSet::new));
    }
}
