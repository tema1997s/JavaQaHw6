package ru.netology.javaqa.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.sumSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldFindAverageSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double expected = 15.0;
        double actual = service.averageSales(arr);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldFindHighestSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int actual = service.maxSales(arr);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldFindHLowestSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.minSales(arr);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldFindHUnderAverageSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.saleUnderAverage(arr);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void shouldFindHOverAverageSales() {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.saleOverAverage(arr);
        Assertions.assertEquals(actual, expected);
    }

}
