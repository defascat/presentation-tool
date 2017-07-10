package org.defascat.presentation.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.lang.RandomStringUtils;
import static org.defascat.presentation.util.Util.writeBytes;

public class BufferredStreams {
    public static void main(String[] args) throws IOException {
        String str = RandomStringUtils.random(1_000_000);
        final byte[] bytes = str.getBytes();
        writeBytes(() -> new BufferedOutputStream(new FileOutputStream("bufferred.txt")), bytes);
        writeBytes(() -> new FileOutputStream("unbufferred.txt"), bytes);
    }
}
