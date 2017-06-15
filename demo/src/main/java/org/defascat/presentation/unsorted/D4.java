package org.defascat.presentation.unsorted;

import java.util.Collections;
import java.util.function.Consumer;

/**
 *
 * @author andy
 */
public class D4 {
    public static void main(String[] args) {
        int value = 0;
        new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t + value);
            }
        }.accept("22");
        System.out.println(value);
    }
}
