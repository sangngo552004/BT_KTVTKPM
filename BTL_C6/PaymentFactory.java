package BTL_C6;

public class PaymentFactory {
    public static PaymentMethod createPaymentMethod(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Loai thanh toan khong duoc de trong");
        }

        switch (type.trim().toUpperCase()) {
            case "COD":
                return new CashOnDeliveryPayment();
            case "CARD":
                return new CreditCardPayment();
            case "EWALLET":
                return new EWalletPayment();
            default:
                throw new IllegalArgumentException("Khong ho tro loai thanh toan: " + type);
        }
    }
}
