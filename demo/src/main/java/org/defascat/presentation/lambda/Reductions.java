package org.defascat.presentation.lambda;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * DIfferent methods with different signuatures
 * @author andy
 */
public class Reductions {
    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.stream().reduce(0, Integer::sum));
        System.out.println(list.stream().reduce(Integer::sum));
        
        Arrays.stream(Stream.class.getDeclaredMethods())
                .filter(m -> m.getName().equals("reduce"))
                .forEach(System.out::println);
    } 
}
