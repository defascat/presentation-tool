package org.defascat.presentation.obsolete;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andy
 */
public class D2 {
    public static void main(String[] args) {
        final Map<String, Integer> map = new HashMap<>();
        map.merge("a", 1, Integer::sum);
        System.out.println(map);
        map.merge("a", 3, Integer::sum);
        System.out.println(map);
    }
    
}
