package org.defascat.presentation.exceptions;

import java.io.IOException;
import java.text.ParseException;

/**
 * javap
 */
public class RethrowException {
    public static void main(String[] args) throws IOException, ParseException {
        try {
            a();
        } catch (Exception e) {
            throw e;
        }
    }
    
    static void a() throws IOException, ParseException {}
}
