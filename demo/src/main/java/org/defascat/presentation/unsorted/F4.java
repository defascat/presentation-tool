package org.defascat.presentation.unsorted;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * partitioningBy
 * @author andy
 */
public class F4 {
    public static void main(String[] args) {
        System.out.println(Stream.<String>empty()
                .collect(Collectors.partitioningBy(String::isEmpty)));
    }
}
