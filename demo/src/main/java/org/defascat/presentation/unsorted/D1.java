package org.defascat.presentation.unsorted;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author andy
 */
public class D1 {
    public static void main(String[] args) {
        Supplier<List> supplier = ArrayList::new;
        printMethods(supplier.getClass().getMethods());
        printMethods(supplier.getClass().getDeclaredMethods());
    }

    private static void printMethods(Method[] methods) {
        System.out.println("---- Methods ----");
        for (Method method : methods) {
            System.out.println(method.getReturnType().getName() + " " + method.getName());
        }
    }
}
