package org.defascat.presentation.last;

import java.io.IOException;
import java.nio.file.FileSystems;

/**
 * The last one.
 */
public class DeadlyTrick {
    public static void main(String[] args) throws IOException {
        FileSystems.getDefault().close();
    }
}
