package BTL_C6;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("B01", "Clean Code", 150000);
        OrderService orderService = new OrderService();

        orderService.checkout(book, 2, "EWALLET");

        StoreConfig config1 = StoreConfig.getInstance();
        StoreConfig config2 = StoreConfig.getInstance();
        System.out.println("Singleton duoc tai su dung: " + (config1 == config2));
    }
}
