package org.defascat.presentation.io;

import java.io.File;

public class UndecidedFile {
    public static void main(String[] args) {
        final File emptyFile = new File("");
        
        System.out.println(emptyFile.isDirectory());
        System.out.println(emptyFile.exists());
        
        System.out.println(emptyFile.getAbsolutePath());
        System.out.println(emptyFile.getAbsoluteFile().isDirectory());
        System.out.println(emptyFile.getAbsoluteFile().exists());
    }
}
