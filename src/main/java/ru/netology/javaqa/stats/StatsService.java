package ru.netology.javaqa.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double averageSales(int[] sales) {
        double average = sumSales(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int saleUnderAverage(int[] sales) {
        int underAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                underAverage++;

            }

        }
        return underAverage;

    }

    public int saleOverAverage(int[] sales) {
        int overAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales(sales)) {
                overAverage++;

            }

        }
        return overAverage;
    }


}
