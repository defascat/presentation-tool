package org.defascat.presentation.basic;

import java.util.Arrays;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        String[] a = {"B", "A"};
        List<String> l = Arrays.asList(a);
        Arrays.sort(a);
        System.out.println(l.get(0));
    }
}
