package BT3_C5;

interface AddressValidator {
    boolean validateStreet(String street);
    boolean validateCity(String city);
    boolean validateStateOrProvince(String stateOrProvince);
    boolean validateZipOrPostalCode(String zipOrPostalCode);
}
