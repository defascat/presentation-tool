package org.defascat.presentation.basic;

public class InstanceOf {
    public static void main(String[] args) {
        System.out.println(new Hippo() instanceof Mother);
        System.out.println(new Hippo() instanceof Elephant);
    }

    public interface Mother {}

    static class HeavyAnimal {}

    static class Hippo extends HeavyAnimal {}

    static class Elephant extends HeavyAnimal {}
}
