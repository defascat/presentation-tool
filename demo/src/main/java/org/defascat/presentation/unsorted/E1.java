package org.defascat.presentation.unsorted;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author andy
 */
public class E1 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        final Stream<String> stream = data.stream()
                .peek(System.out::println)
                .peek(data::remove);
        System.out.println("Count: " + stream.count());
    }
}
