package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private final long[] purchaces = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private final StatsServiceTest statsServiceTest = new StatsServiceTest();


    @Test
    public void shouldSum() {
        long actual = StatsService.sum(purchaces);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAvg() {
       assertEquals(15, StatsService.avg(purchaces));
    }

    @Test
    public void shouldReturnMonthWithMax() {
        assertEquals(8, StatsService.MonthWithMax(purchaces));
    }

    @Test
    public void shouldReturnMonthWithMin() {
        assertEquals(9, StatsService.monthWithMin(purchaces));
    }

    @Test
    public void shouldReturnMonthsWithMore() {
        assertEquals(5, StatsService.monthsWithMoreThanAvg(purchaces));
    }

    @Test
    public void shouldReturnMonthsWithLess() {
        assertEquals(5, StatsService.monthsWithLessThanAvg(purchaces));
    }

}

