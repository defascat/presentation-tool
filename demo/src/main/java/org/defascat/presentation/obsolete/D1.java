package org.defascat.presentation.obsolete;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.defascat.presentation.util.Util;

public class D1 {
    public static void main(String[] args) {
        Supplier<List> supplier = ArrayList::new;
        Util.printMethods(supplier.getClass().getMethods());
        Util.printMethods(supplier.getClass().getDeclaredMethods());
    }
}
