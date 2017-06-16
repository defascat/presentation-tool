package org.defascat.presentation.locale;

import java.util.Locale;
import java.util.ResourceBundle;
/**
 * Empty locale and strange properties
 */
public class EmptyLocale {
    public static void main(String[] args) {
        final Locale locale = new Locale("", "");
        System.out.println("Locale: " + locale);
        
        ResourceBundle bundle = ResourceBundle.getBundle("org.defascat.presentation.locale.props", locale);
        System.out.println("a:" + bundle.getString("a"));
        System.out.println("b:" + bundle.getString("b"));
        System.out.println("c:" + bundle.getString("c"));
    }
}
