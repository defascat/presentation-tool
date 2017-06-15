package org.defascat.presentation.unsorted;

/**
 *
 * @author andy
 */
public class A5 {
    public static void main(String[] args) {
        new A5().a();
    }
    
    void a() {
        class B {
        }
        System.out.println(new B().getClass());
    }
}
