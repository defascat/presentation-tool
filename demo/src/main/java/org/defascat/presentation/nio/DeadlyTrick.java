package org.defascat.presentation.nio;

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
