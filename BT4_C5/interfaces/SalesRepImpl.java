package BT4_C5.interfaces;

class SalesRepImpl implements IEmployee {
    // Phải khai báo lại thuộc tính
    private String id;
    private String name;
    private double baseSalary;
    private double commission;

    public SalesRepImpl(String id, String name, double baseSalary, double commission) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.commission = commission;
    }

    // Phải tự viết lại các phương thức get
    @Override
    public String getId() { return id; }

    @Override
    public String getName() { return name; }

    @Override
    public double calculateIncome() {
        return baseSalary + commission;
    }

    // Phải tự viết lại logic hiển thị
    @Override
    public void displayData() {
        System.out.println("ID: " + id + " | Tên: " + name);
        System.out.println("Thu nhập: $" + calculateIncome());
        System.out.println("-------------------------");
    }
}