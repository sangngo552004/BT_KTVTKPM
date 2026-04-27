package BTL_C6;

public class OrderService {
    public void checkout(Book book, int quantity, String paymentType) {
        StoreConfig config = StoreConfig.getInstance();
        PaymentMethod paymentMethod = PaymentFactory.createPaymentMethod(paymentType);

        double subtotal = book.getPrice() * quantity;
        double total = subtotal + config.getShippingFee();

        System.out.println("Cua hang: " + config.getStoreName());
        System.out.println("Sach: " + book.getTitle());
        System.out.println("So luong: " + quantity);
        System.out.println("Tam tinh: " + subtotal + " VND");
        System.out.println("Phi giao hang: " + config.getShippingFee() + " VND");
        System.out.println("Phuong thuc thanh toan: " + paymentMethod.getMethodName());
        paymentMethod.pay(total);
        System.out.println("Ho tro khach hang: " + config.getHotline());
    }
}
