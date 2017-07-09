package org.defascat.presentation.time;

import java.time.chrono.HijrahDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.ThaiBuddhistDate;

/**
 *
 * @author andy
 */
public class Dates {
    public static void main(String[] args) {
        System.out.println(MinguoDate.now());       // PRC
        System.out.println(ThaiBuddhistDate.now()); // Gautama Budda birth era
        System.out.println(JapaneseDate.now());     // Current Emperor Era
        System.out.println(HijrahDate.now());       // Mohhamad migrated from Mecca to Medina
    }
}
