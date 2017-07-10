package org.defascat.presentation.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reductions {
    public static void main(String[] args) {
        final List<Integer> list = new ArrayList<>();
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().reduce(Integer::sum));
        
        Arrays.stream(Stream.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("reduce"))
                .forEach(System.out::println);
    } 
}
