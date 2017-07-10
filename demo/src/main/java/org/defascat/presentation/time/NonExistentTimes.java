package org.defascat.presentation.time;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NonExistentTimes {
    public static void main(String[] args) {
        final ZoneId laTimeZone = ZoneId.of("America/Los_Angeles");
        System.out.println(ZonedDateTime.of(2017, Month.MARCH.getValue(), 12, 2, 0, 0, 0, laTimeZone));
        System.out.println(ZonedDateTime.of(2017, Month.MARCH.getValue(), 12, 3, 0, 0, 0, laTimeZone));
    }
}
