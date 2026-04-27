class CategoryA extends Employee {
    private final double BASE_SALARY = 2000;
    private final double OT_RATE = 15;

    public CategoryA(String name, String role, int overtimeHours) {
        super(name, role, overtimeHours);
    }

    @Override
    public double getSalary() {
        return BASE_SALARY + (overtimeHours * OT_RATE);
    }
}