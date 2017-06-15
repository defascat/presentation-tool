package org.defascat.presentation.time;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Non existent times
 * @author andy
 */
public class NonExistentTimes {
    public static void main(String[] args) {
        final ZoneId laTimeZone = ZoneId.of("America/Los_Angeles");
        final ZonedDateTime dateTime = ZonedDateTime.of(2017, Month.MARCH.getValue(), 12, 1, 59, 0, 0, laTimeZone);
        System.out.println(dateTime);
        System.out.println(dateTime.plusMinutes(1));
        System.out.println(ZonedDateTime.of(2017, Month.MARCH.getValue(), 12, 2, 0, 0, 0, laTimeZone));
        System.out.println(ZonedDateTime.of(2017, Month.MARCH.getValue(), 12, 3, 0, 0, 0, laTimeZone));
    }
}
