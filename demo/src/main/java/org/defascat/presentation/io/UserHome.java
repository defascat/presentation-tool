package org.defascat.presentation.io;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * java -jar  "~/.bashrc"
 */
public class UserHome {

    public static void main(String[] args) throws URISyntaxException {
        Path path = Paths.get(args[0]);
        System.out.println(path.toAbsolutePath());
    }
}
