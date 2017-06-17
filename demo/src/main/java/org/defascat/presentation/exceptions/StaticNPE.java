package org.defascat.presentation.exceptions;

/**
 javap -c -verbose ../demo/target/classes/org/defascat/presentation/exceptions/StaticNPE.class
 4: invokestatic  #2
 #2 = Methodref          #6.#24         // org/defascat/presentation/exceptions/StaticNPE.boo:()V
 #6 = Class              #30            // org/defascat/presentation/exceptions/StaticNPE
 */
public class StaticNPE {
    public static void main(String[] args) {
        StaticNPE a = null;
        a.boo();
        if (System.currentTimeMillis() < 0) {
            a.toString();
        }
    }
    
    static void boo() {
        System.out.println("Boo!");
    }
}
