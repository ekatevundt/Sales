public class Main {
    public static void main(String[] args) {
        long [] sales = {3, 44, 3, 4, 5, 6};
        SalesManager salesManager = new SalesManager(sales);
        salesManager.max();
        System.out.println(salesManager.max());
    }
}