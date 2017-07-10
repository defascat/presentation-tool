package org.defascat.presentation.basic;

public class StringBuilders {
    public static void main(String[] args) {
        System.out.println(new String("a").equals(new String("a")));                // 4
        System.out.println(new StringBuilder("a").equals(new StringBuilder("a")));  // 5
    }
}
