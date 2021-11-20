package ru.netology.stats;

public class StatsService {


    public static long sum(long[] items) {
        long result = 0;
        for (long item: items) {
            result = result + item;
        }
        return result;
    }
    public static long avg(long[] items) {
        long sum = sum(items);
        return sum / items.length;

    }
    public static int MonthWithMax(long[] items) {
        long max = items [0];
        for (long item : items) {
            if (max < item) {
                max = item;
            }
        }
        int monthCount = 0;
        int monthWithMax = 0;
        for (long item : items) {
            monthCount ++;
            if (item == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }
    public static int monthWithMin(long[] items) {
        long min = getMin(items);
        int monthCount = 0;
        int monthWithMin = 0;
        for (long item : items) {
            monthCount ++;
            if (item == min) {
                monthWithMin = monthCount;
            }
        }
        return monthWithMin;
    }
    public static int monthsWithMoreThanAvg(long[] items) {
        long avg = avg(items);
        int monthCount = 0;
        for (long item : items) {
            if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
    public static int monthsWithLessThanAvg(long[] items) {
        long avg = avg(items);
        int monthCount = 0;
        for (long item : items) {
            if (item < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    private long getMax (long[] items) {
        long max = items[0];
        for (long item : items) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    private static long getMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (min > item) {
                min = item;
        }
    }
        return min;
    }
}
