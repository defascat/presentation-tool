package org.defascat.presentation.time;

import java.time.Period;

/**
 * Period chain
 * @author andy
 */
public class PeriodChain {
    public static void main(String[] args) {
        System.out.println(Period.ofMonths(2).ofDays(3));
        System.out.println(Period.of(0, 2, 3));
        System.out.println(Period.ofWeeks(5));
    }
}
