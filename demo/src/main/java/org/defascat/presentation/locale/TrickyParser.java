package org.defascat.presentation.locale;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 */
public class TrickyParser {
    public static void main(String[] args) throws ParseException {
        final NumberFormat formatter = NumberFormat.getIntegerInstance();
        System.out.println("Parsed: " + formatter.parse("100.12#Some nonsense"));
        System.out.println("Parsed: " + formatter.parse(" 200"));
    }
}
