package org.defascat.presentation.obsolete;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;

public class HttpFile {
    public static void main(String[] args) throws URISyntaxException {
        FileSystemProvider.installedProviders()
                .forEach(p -> System.out.println(p.getScheme() + " - " + p.getClass().getSimpleName()));

        final Path path = Paths.get(new URI("http://jprof.by"));
        System.out.println(Files.exists(path));
    }
}
