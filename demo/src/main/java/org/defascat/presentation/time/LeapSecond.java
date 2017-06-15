package org.defascat.presentation.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Leap second
 * @author andy
 */
public class LeapSecond {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.of(2015, 6, 30, 23, 59, 60, 0, ZoneId.of("UTC")));
    }
}
