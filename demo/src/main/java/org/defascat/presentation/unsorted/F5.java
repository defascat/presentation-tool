package org.defascat.presentation.unsorted;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author andy
 */
public class F5 {
    public static void main(String[] args) {
        String[] classes = {"Boolean", "Int", "Long", "Double"};
        String[] patterns = {"%sSupplier", "%sConsumer", "%sFunction", "%sPredicate"};
        System.out.println("\t\t\t" + Arrays.stream(classes).collect(Collectors.joining("\t")));
        for (String pattern : patterns) {
            String result = pattern + "\t\t";
            for (String clazz : classes) {
                String clazzName = String.format("java.util.function." + pattern, clazz);
                boolean found = true;
                try {
                    Class.forName(clazzName);
                } catch (ClassNotFoundException ex) {
                    found = false;
                }
                result += (found ? "+" : "-") + "\t";
            }
            System.out.println(result);
        }
    }
}
