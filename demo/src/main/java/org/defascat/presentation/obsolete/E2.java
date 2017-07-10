package org.defascat.presentation.obsolete;

import java.util.stream.Stream;

public class E2 {
    public static void main(String[] args) {
        Stream.generate(() -> "test")
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
