package BT3_C5;

class VNAddress implements AddressValidator {

    @Override
    public boolean validateStreet(String street) {
        // Số nhà, tên đường phố không được để trống (có thể chứa số, chữ, dấu phẩy, sẹc...)
        return street != null && street.trim().length() > 0;
    }

    @Override
    public boolean validateCity(String city) {
        // Quận/Huyện/Thành phố thuộc tỉnh (VD: "Quận 1", "Thủ Đức", "TP Bắc Ninh")
        return city != null && !city.trim().isEmpty();
    }

    @Override
    public boolean validateStateOrProvince(String province) {
        // Tỉnh/Thành phố trực thuộc TW (VD: "Hà Nội", "Hồ Chí Minh")
        // Chỉ cần không trống và độ dài hợp lý
        return province != null && province.trim().length() > 2;
    }

    @Override
    public boolean validateZipOrPostalCode(String postalCode) {
        // Mã bưu chính (Postal Code) của Việt Nam hiện nay là 5 chữ số (VD: 10000 cho Hà Nội)
        return postalCode != null && postalCode.matches("^\\d{5}$");
    }
}
