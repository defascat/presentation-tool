package org.defascat.presentation.lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {
    public static void main(String[] args) {
        final Stream<String> emptyStream = Stream.<String>empty();
        final Map<Boolean, List<String>> result = emptyStream
                .collect(Collectors.partitioningBy(String::isEmpty));
        System.out.println(result);
    }
}
