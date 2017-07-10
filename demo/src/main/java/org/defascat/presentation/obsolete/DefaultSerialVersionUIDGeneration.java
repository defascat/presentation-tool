package org.defascat.presentation.obsolete;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 1 - class name
 * 2 - class modifiers
 * 3 - interface names
 * 4 - fields signatures
 * 5 - static initializers
 * 6 - constructors
 * 7 - method signatures
 * 8 - SHA-1
 * @author andy
 */
public class DefaultSerialVersionUIDGeneration {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA");
        System.out.println(md.getAlgorithm());
    }
}
