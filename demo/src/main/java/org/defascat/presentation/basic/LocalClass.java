package org.defascat.presentation.basic;

public class LocalClass {
    public static void main(String[] args) throws ClassNotFoundException {
        new LocalClass().a();
        System.out.println(Class.forName("org.defascat.presentation.unsorted.A5$1B"));
    }
    
    void a() {
        class B {
        }
        System.out.println(new B().getClass());
    }
}
