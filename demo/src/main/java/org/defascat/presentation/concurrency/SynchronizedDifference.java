package org.defascat.presentation.concurrency;

/**
 *  javap -verbose -c ../demo/target/classes/org/defascat/presentation/concurrency/SynchronizedDifference.class 
 * @author andy
 */
public class SynchronizedDifference {
    public static void main(String[] args) {        
    }
    
    public synchronized void doIt() {
    }

    public void doIt2() {
        synchronized(this) {
        }
    }
}
