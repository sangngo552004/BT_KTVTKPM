package BTL_C6;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang the tin dung: " + amount + " VND");
    }

    @Override
    public String getMethodName() {
        return "Credit Card";
    }
}
