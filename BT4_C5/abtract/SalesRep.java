package BT4_C5.abtract;

class SalesRep extends Employee {
    private double baseSalary;
    private double commission; // Tiền hoa hồng

    public SalesRep(String id, String name, double baseSalary, double commission) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    @Override
    public double calculateIncome() {
        return baseSalary + commission;
    }
}