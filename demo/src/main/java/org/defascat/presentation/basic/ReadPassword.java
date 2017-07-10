package org.defascat.presentation.basic;

import java.io.Console;
import java.lang.reflect.Method;

public class ReadPassword {
    public static void main(String[] args) throws NoSuchMethodException {
        final Method method = Console.class.getDeclaredMethod("readPassword");
        System.out.println(method);
    }
}
