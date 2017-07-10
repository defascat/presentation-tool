package org.defascat.presentation.exceptions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FernFlower
 */
public class TryWithResources {
    public static void main(String[] args) {
        try(InputStream is1 = new ByteArrayInputStream(new byte[0]);
                InputStream is2 = new ByteArrayInputStream(new byte[0])) {
        } catch (IOException e) {}
    }
}