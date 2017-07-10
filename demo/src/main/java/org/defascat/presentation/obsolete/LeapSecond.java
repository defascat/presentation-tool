package org.defascat.presentation.obsolete;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LeapSecond {
    public static void main(String[] args) {
        System.out.println(ZonedDateTime.of(2015, 6, 30, 23, 59, 60, 0, ZoneId.of("UTC")));
    }
}
