package BT4_C5.interfaces;

class ConsultantImpl implements IEmployee {
    // Tương tự, cũng phải lặp lại việc khai báo id, name và các hàm get, display...
    private String id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public ConsultantImpl(String id, String name, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public double calculateIncome() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayData() {
        System.out.println("ID: " + id + " | Tên: " + name);
        System.out.println("Thu nhập: $" + calculateIncome());
        System.out.println("-------------------------");
    }
}
