package org.defascat.presentation.exceptions;

/**
 * Assert
 * @author andy
 *  0: getstatic     #2                  // Field $assertionsDisabled:Z
       3: ifne          16
       6: new           #3                  // class java/lang/AssertionError
       9: dup
      10: ldc           #4                  // String Noooo!
      12: invokespecial #5                  // Method java/lang/AssertionError."<init>":(Ljava/lang/Object;)V
      15: athrow
      16: return

 */
public class AssertTest {
    public static void main(String[] args) {
        assert false: "Noooo!";
    }
}
