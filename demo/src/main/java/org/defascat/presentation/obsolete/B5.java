package org.defascat.presentation.obsolete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andy
 */
public class B5 {
    static class Bird {}
    static class Sparrow extends Bird{}
    public static void main(String[] args) {
        List<? extends Bird> l = new ArrayList<>();
//        l.add(new Sparrow());
//        l.add(new Bird());
    }
}
