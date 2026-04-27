class CategoryB extends Employee {
    private final double BASE_SALARY = 1500;
    private final double OT_RATE = 10;

    public CategoryB(String name, String role, int overtimeHours) {
        super(name, role, overtimeHours);
    }

    @Override
    public double getSalary() {
        return BASE_SALARY + (overtimeHours * OT_RATE);
    }
}