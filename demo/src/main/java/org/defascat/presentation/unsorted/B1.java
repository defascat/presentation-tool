package org.defascat.presentation.unsorted;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andy
 */
public class B1 {
    public static void main(String[] args) {
        String[] a = {"B", "A"};
        List<String> l = Arrays.asList(a);
        Arrays.sort(a);
        System.out.println(l.get(0));
    }
}
