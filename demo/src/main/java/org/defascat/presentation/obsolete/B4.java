package org.defascat.presentation.obsolete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andy
 */
public class B4 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.remove(3);
        l.remove((Integer) 1);
        System.out.println(l);
    }
}
