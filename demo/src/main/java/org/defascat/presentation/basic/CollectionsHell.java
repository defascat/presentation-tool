package org.defascat.presentation.basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsHell {
    public static void main(String[] args) {
        final LinkedList<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        
        final Queue<Integer> queue = new LinkedList<>(l);
        queue.remove(1);
        
        final List<Integer> list = new LinkedList<>(l);
        list.remove(1);
        
        System.out.println(queue + " vs " + list);
    }
    
}
