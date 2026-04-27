package BT4_C5.abtract;

abstract class Employee {
    protected String id;
    protected String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Phương thức chung: Truy cập thuộc tính
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Phương thức chung: Hiển thị dữ liệu
    public void displayData() {
        System.out.println("ID: " + id + " | Tên: " + name);
        System.out.println("Thu nhập: $" + calculateIncome());
        System.out.println("-------------------------");
    }

    // Phương thức trừu tượng: Tính thu nhập (lớp con phải ghi đè)
    public abstract double calculateIncome();
}
