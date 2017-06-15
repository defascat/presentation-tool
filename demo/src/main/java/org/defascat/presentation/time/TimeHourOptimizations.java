package org.defascat.presentation.time;

import java.time.LocalTime;

/**
 * Hour optimizations
 * @author andy
 */
public class TimeHourOptimizations {
    public static void main(String[] args) {
        System.out.println(LocalTime.of(10, 0, 0) == LocalTime.of(10, 0, 0));
        System.out.println(LocalTime.of(10, 1, 0) == LocalTime.of(10, 1, 0));
    }
}
