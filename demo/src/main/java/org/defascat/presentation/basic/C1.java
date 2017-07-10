package org.defascat.presentation.basic;

import java.util.Random;

public class C1 {
    public static void main(String[] args) {
        final C1 c1 = new C1();
        for (int i = 0 ; i < 3; i++) {
            System.out.println(c1.hashCode() + " vs " + System.identityHashCode(c1));
        }
    }

    @Override
    public int hashCode() {
        return new Random().nextInt(100);
    }
}
