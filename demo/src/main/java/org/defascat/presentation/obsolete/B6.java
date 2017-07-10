package org.defascat.presentation.obsolete;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andy
 */
public class B6 {
    public static void main(String[] args) {
        List<? super IOException> l = new ArrayList<>();
//        l.add(new Exception());
        l.add(new FileNotFoundException());
    }
}
