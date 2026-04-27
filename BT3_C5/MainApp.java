package BT3_C5;

public class MainApp {
    
    // Phương thức tiện ích để kiểm tra toàn bộ địa chỉ
    public static void checkAddress(AddressValidator validator, String country, 
                                    String street, String city, String state, String zip) {
        System.out.println("--- Kiem tra dia chi: " + country + " ---");
        System.out.println("Duong: " + street + " -> " + (validator.validateStreet(street) ? "Hop le" : "Loi"));
        System.out.println("Thanh Pho/Quan: " + city + " -> " + (validator.validateCity(city) ? "Hop le" : "Loi"));
        System.out.println("Bang/Tinh: " + state + " -> " + (validator.validateStateOrProvince(state) ? "Hop le" : "Loi"));
        System.out.println("Ma buu chinh: " + zip + " -> " + (validator.validateZipOrPostalCode(zip) ? "Hop le" : "Loi"));
        System.out.println();
    }

    public static void main(String[] args) {
        AddressValidator usaValidator = new USAAddress();
        AddressValidator vnValidator = new VNAddress();

        // Kiểm tra địa chỉ Hoa Kỳ (Hợp lệ)
        checkAddress(usaValidator, "Hoa Ky (USA)", 
                     "1600 Pennsylvania Avenue NW", "Washington", "DC", "20500");

        // Kiểm tra địa chỉ Hoa Kỳ (Không hợp lệ: Bang sai định dạng, ZIP Code sai)
        checkAddress(usaValidator, "Hoa Ky (USA) - Loi", 
                     "123 Main St", "New York123", "NewYork", "ABCDE");

        // Kiểm tra địa chỉ Việt Nam (Hợp lệ)
        checkAddress(vnValidator, "Viet Nam (VN)", 
                     "So 1 Dai Co Viet", "Quan Hai Ba Trung", "Ha Noi", "10000");

        // Kiểm tra địa chỉ Việt Nam (Không hợp lệ: Mã bưu chính sai vì có chữ)
        checkAddress(vnValidator, "Viet Nam (VN) - Loi", 
                     "Khu pho 6, Phuong Linh Trung", "Thu Duc", "Ho Chi Minh", "70000A");
    }
}
