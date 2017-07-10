package org.defascat.presentation.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author andy
 */
public class SideEffects {
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
