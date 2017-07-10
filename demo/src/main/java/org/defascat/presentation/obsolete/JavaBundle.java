package org.defascat.presentation.obsolete;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class JavaBundle extends ListResourceBundle {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle(JavaBundle.class.getName());
        System.out.println(bundle.getString("a"));
        System.out.println(bundle.getObject("b"));
        System.out.println(bundle.getString("b"));
    }

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"a", "22"}, {"b", 23}};
    }
}
