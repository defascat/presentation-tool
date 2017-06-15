package org.defascat.presentation.unsorted;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author andy
 */
public class D3 {
    public static void main(String[] args) {
        final LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        final Queue<Integer> queue = new LinkedList<>(l);
        final List<Integer> list = new LinkedList<>(l);
        queue.remove(1);
        list.remove(1);
        System.out.println(queue + " vs " + list);
    }
    
}
