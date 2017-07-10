package org.defascat.presentation.basic;

/**
 javap
 */
public class StaticNPE {
    public static void main(String[] args) {
        ((StaticNPE)null).boo();
    }
    
    static void boo() {
        System.out.println("Boo!");
    }
}
