package BT3_C5;

class USAAddress implements AddressValidator {

    @Override
    public boolean validateStreet(String street) {
        // Đường phố không được để trống
        return street != null && !street.trim().isEmpty();
    }

    @Override
    public boolean validateCity(String city) {
        // Tên thành phố chỉ chứa chữ cái và khoảng trắng
        return city != null && city.matches("^[a-zA-Z\\s]+$");
    }

    @Override
    public boolean validateStateOrProvince(String state) {
        // Bang của Mỹ viết tắt bằng 2 chữ cái in hoa (VD: NY, CA, TX)
        return state != null && state.matches("^[A-Z]{2}$");
    }

    @Override
    public boolean validateZipOrPostalCode(String zipCode) {
        // ZIP Code của Mỹ có định dạng 5 số (VD: 12345) hoặc 5 số + 4 số mở rộng (VD: 12345-6789)
        return zipCode != null && zipCode.matches("^\\d{5}(-\\d{4})?$");
    }
}
