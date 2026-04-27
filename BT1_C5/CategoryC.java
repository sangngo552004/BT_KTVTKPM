class CategoryC extends Employee {
    private final double BASE_SALARY = 800;
    private final double OT_RATE = 5;

    public CategoryC(String name, String role, int overtimeHours) {
        super(name, role, overtimeHours);
    }

    @Override
    public double getSalary() {
        return BASE_SALARY + (overtimeHours * OT_RATE);
    }
}