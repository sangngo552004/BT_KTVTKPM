package BTL_C6;

public class EWalletPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang vi dien tu: " + amount + " VND");
    }

    @Override
    public String getMethodName() {
        return "E-Wallet";
    }
}
