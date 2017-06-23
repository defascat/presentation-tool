package org.defascat.presentation.io;

import java.io.Console;
import java.lang.reflect.Method;

/**
 * Why char[]
 * @author andy
 */
public class ReadPassword {
    public static void main(String[] args) throws NoSuchMethodException {
        final Method method = Console.class.getDeclaredMethod("readPassword");
        System.out.println(method);
    }
}
