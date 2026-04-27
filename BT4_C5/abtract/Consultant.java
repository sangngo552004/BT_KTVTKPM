package BT4_C5.abtract;

class Consultant extends Employee {
    private double hourlyRate; // Lương theo giờ
    private int hoursWorked;   // Số giờ làm

    public Consultant(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateIncome() {
        return hourlyRate * hoursWorked;
    }
}
