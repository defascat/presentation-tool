package org.defascat.presentation.unsorted;

/**
 *
 * @author andy
 */
public class A2 {
    public static void main(String[] args) {
        System.out.println("a" == "a");                                             // 1
        System.out.println("a".equals("a"));                                        // 2
        System.out.println(new String("a") == new String("a"));                     // 3
        System.out.println(new String("a").equals(new String("a")));                // 4
        System.out.println(new StringBuilder("a").equals(new StringBuilder("a")));  // 5
    }
}
