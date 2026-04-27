public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== UNG DUNG TINH LUONG DOANH NGHIEP ===\n");

        // Tạo đối tượng nhân viên Loại A (Lập trình viên, làm thêm 10 giờ)
        Employee dev = new CategoryA("Nguyen Van Code", "Lap Trinh Vien", 10);
        
        // Tạo đối tượng nhân viên Loại B (Kế toán, làm thêm 5 giờ)
        Employee accountant = new CategoryB("Tran Thi Tien", "Ke Toan", 5);
        
        // Tạo đối tượng nhân viên Loại C (Nhân viên bán hàng, làm thêm 20 giờ)
        Employee sales = new CategoryC("Le Van Chot", "Nhan Vien Ban Hang", 20);

        // Gọi phương thức hiển thị (trong display() đã tự động gọi getSalary() tương ứng)
        dev.display();
        accountant.display();
        sales.display();
    }
}