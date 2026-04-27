package BTL_C6;

public class StoreConfig {
    private static StoreConfig instance;

    private final String storeName;
    private final double shippingFee;
    private final String hotline;

    private StoreConfig() {
        this.storeName = "BookVerse Online";
        this.shippingFee = 25000;
        this.hotline = "1900-1234";
    }

    public static synchronized StoreConfig getInstance() {
        if (instance == null) {
            instance = new StoreConfig();
        }
        return instance;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public String getHotline() {
        return hotline;
    }
}
