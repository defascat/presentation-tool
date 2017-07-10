package org.defascat.presentation.obsolete;

import java.io.IOException;

/**
 * Reassigning exception
 * JavaC
 * @author andy
 */
public class ReassigningException {

    public static void main(String[] args) throws IOException {
        try {
            throw new IOException();
        } catch (IllegalArgumentException e) {
            e = new IllegalArgumentException();
        } catch (IOException | RuntimeException e) {
            // e = new RuntimeException();
        }
    }
}
