public class Main {

    public static void main(String[] args) {
        int[] sales = new int[]{5364, 7281, 6490};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);
    }
}