# So sánh hai cách cài đặt: Abstract Class và Interface

Trong bài toán phân cấp nhân viên (Employee), việc lựa chọn giữa **Abstract Class** (Lớp trừu tượng) và **Interface** (Giao diện) mang lại những cấu trúc thiết kế rất khác nhau. Dưới đây là bảng so sánh chi tiết giữa hai cách tiếp cận này:

## 1. Bảng so sánh chi tiết

| Tiêu chí | Sử dụng Abstract Class (Cách a) | Sử dụng Interface (Cách b) |
| :--- | :--- | :--- |
| **Mức độ tái sử dụng code** | **Rất tốt.** Các thuộc tính chung (`id`, `name`) và hàm hiển thị (`displayData()`) chỉ cần viết 1 lần ở lớp cha `Employee`. Các lớp con chỉ cần tập trung viết logic tính lương riêng biệt. | **Rất kém.** Mọi lớp con (`SalesRep`, `Consultant`) đều phải tự khai báo lại các thuộc tính chung và phải viết lại toàn bộ code cho các hàm `getId()`, `getName()`, `displayData()`. |
| **Bản chất mối quan hệ** | Mô tả mối quan hệ **"Is-a" (Là một)**. Ví dụ: Nhân viên bán hàng *là một* Nhân viên (SalesRep is an Employee). | Mô tả mối quan hệ **"Can-do" (Có khả năng làm gì)**. Đóng vai trò như một bản hợp đồng bắt buộc các lớp thực thi phải có các phương thức đó. |
| **Quản lý trạng thái (State)** | Cho phép khai báo các biến (thuộc tính) để lưu giữ trạng thái của đối tượng (ví dụ: tên, mã nhân viên). | Không thể khai báo biến instance. Chỉ có thể khai báo các hằng số (`static final`). |
| **Khả năng mở rộng** | Một lớp con chỉ có thể kế thừa (extends) **duy nhất một** Abstract Class (Đơn kế thừa). | Một lớp có thể triển khai (implements) **nhiều** Interface cùng lúc (Đa kế thừa hành vi). |

---

## 2. Kết luận & Khuyến nghị

Dựa trên bối cảnh của bài toán quản lý doanh nghiệp:

* **Nên chọn Abstract Class (Cách a):** Tối ưu và chuẩn xác hơn rất nhiều. Các loại nhân viên trong hệ thống đều chia sẻ chung một **bản chất**, chung **thuộc tính dữ liệu** (như tên, ID) và chung một số **logic xử lý** nhất định. Việc dùng Abstract Class giúp tái sử dụng code, tuân thủ nguyên tắc DRY (Don't Repeat Yourself) trong lập trình.
* **Chỉ nên dùng Interface khi:** Bạn muốn định nghĩa một tập hợp các hành động (khả năng) độc lập, có thể gắn cho nhiều loại đối tượng hoàn toàn khác nhau không có chung bản chất (Ví dụ: interface `IPrintable` có thể dùng cho cả nhân viên `Employee`, hóa đơn `Invoice` hoặc báo cáo `Report`).