package org.defascat.presentation.unsorted;

/**
 *
 * @author andy
 */
public class A1 {

    public static void main(String[] args) {
        System.out.println(new Hippo() instanceof Mother);   // 1
//        System.out.println(new Hippo() instanceof Elephant); // 2
    }

    public interface Mother {
    }

    static class HeavyAnimal {
    }

    static class Hippo extends HeavyAnimal {
    }

    static class Elephant extends HeavyAnimal {
    }
}
