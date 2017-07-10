package org.defascat.presentation.basic;

public class Caches {
    public static void main(String[] args) {
        System.out.println(Short.valueOf((short) 22) == Short.valueOf((short) 22));
        System.out.println(Character.valueOf((char) 22) == Character.valueOf((char) 22));
        System.out.println(Integer.valueOf(22) == Integer.valueOf(22));
        System.out.println(Long.valueOf(22) == Long.valueOf(22));
        System.out.println(Double.valueOf(22) == Double.valueOf(22));
    }
}
