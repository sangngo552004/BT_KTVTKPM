package BTL_C6;

public class CashOnDeliveryPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Khach hang chon thanh toan khi nhan hang: " + amount + " VND");
    }

    @Override
    public String getMethodName() {
        return "Cash On Delivery";
    }
}
