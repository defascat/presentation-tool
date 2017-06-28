package org.defascat.presentation.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

/**
 *
 * @author andy
 */
public class Loop {

    public static void main(String[] args) throws IOException {
        final Path path1 = Paths.get("1");
        final Path path2 = Paths.get("2");
        Files.deleteIfExists(path1);
        Files.deleteIfExists(path2);
        
        Files.createSymbolicLink(path1, path2, new FileAttribute[0]);
        Files.createSymbolicLink(path2, path1, new FileAttribute[0]);
        
        System.out.println(path1.toRealPath(new LinkOption[0]));
    }
}
