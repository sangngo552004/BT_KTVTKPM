abstract class Employee implements SalaryCalculator {
    protected String name;         
    protected String role;         
    protected int overtimeHours;   

    public Employee(String name, String role, int overtimeHours) {
        this.name = name;
        this.role = role;
        this.overtimeHours = overtimeHours;
    }

    public void display() {
        System.out.println("Nhan vien: " + name + " | Vi tri: " + role);
        System.out.println("Gio lam them: " + overtimeHours + " gio");
        System.out.println("Tong luong: $" + getSalary());
        System.out.println("-------------------------------------------------");
    }
}