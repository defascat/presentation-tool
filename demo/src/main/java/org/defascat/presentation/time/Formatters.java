package org.defascat.presentation.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Formatters {

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat();

    public static void main(String[] args) {
        int[] sizes = new int[]{10, 100, 1000, 10000};
        for (int size : sizes) {
            System.out.println("Size: " + size);
            
            List<String> sequentialDates = datesToString(LongStream.range(0, size).sequential());
            System.out.println("Sequential: " + sequentialDates.size());

            List<String> parallelDates = datesToString(LongStream.range(0, size).parallel());
            System.out.println("Parallel: " + parallelDates.size());
            
            System.out.println();
        }
    }

    private static List<String> datesToString(final LongStream stream) {
        return stream
                .map(i -> i * 1_000 * 60 * 60 * 24)
                .mapToObj(Date::new)
                .map(FORMAT::format)
                .distinct()
                .collect(Collectors.toList());
    }
}
