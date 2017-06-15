package org.defascat.presentation.time;

import java.time.LocalDate;
import java.time.Month;

/**
 * Code full of magic constants
 * @author andy
 */
public class LocalDateCreateImplementation {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2017, Month.FEBRUARY, 29));
    }
}

/*
private static LocalDate create(int year, int month, int dayOfMonth) {
        if (dayOfMonth > 28) {
            int dom = 31;
            switch (month) {
                case 2:
                    dom = (IsoChronology.INSTANCE.isLeapYear(year) ? 29 : 28);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dom = 30;
                    break;
            }
            if (dayOfMonth > dom) {
                if (dayOfMonth == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + year + "' is not a leap year");
                } else {
                    throw new DateTimeException("Invalid date '" + Month.of(month).name() + " " + dayOfMonth + "'");
                }
            }
        }
        return new LocalDate(year, month, dayOfMonth);
    }

*/