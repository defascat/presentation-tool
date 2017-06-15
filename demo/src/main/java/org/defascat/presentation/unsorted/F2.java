package org.defascat.presentation.unsorted;

import java.util.stream.IntStream;

/**
 * Summary statistics
 * @author andy
 */
public class F2 {
    public static void main(String[] args) {
        final IntStream ints = IntStream.of(10, 20, 30);
        System.out.println(ints.summaryStatistics());
    }
}
