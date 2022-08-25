

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average() {
        int counter = 0 - 2;
        int sum = 0 - max() - min();
        for (int sale : sales) {
            sum += sale;
            counter++;
        }
        int average = sum / counter;
        System.out.println(average);
        return average;
    }
}