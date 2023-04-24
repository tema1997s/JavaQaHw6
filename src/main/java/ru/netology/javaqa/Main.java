package ru.netology.javaqa;
import ru.netology.javaqa.stats.StatsService;

public class Main {
    public static void main(String[] args) {

        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();

        int minDay = service.minSales(arr);
        System.out.println(minDay);
        int sum = service.sumSales(arr);
        System.out.println(sum);
        double average = service.averageSales(arr);
        System.out.println(average);
        int maxDay = service.maxSales(arr);
        System.out.println(maxDay);
        int underAverage = service.saleUnderAverage(arr);
        System.out.println(underAverage);
        int overAverage = service.saleOverAverage(arr);
        System.out.println(overAverage);


    }
}