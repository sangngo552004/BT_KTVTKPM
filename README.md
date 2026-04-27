# README Tổng Hợp Bài Tập Java

## 1. Giới thiệu

Tài liệu này tổng hợp các bài tập đã được triển khai trong thư mục `bai_tap_KTVTKPM`. Nội dung bao gồm các bài về `interface`, `abstract class` và các mẫu thiết kế `Factory`, `Singleton`. Mỗi bài được cài đặt ở mức mô hình hóa yêu cầu đề bài, tập trung vào cấu trúc hướng đối tượng và khả năng mở rộng, không mô phỏng toàn bộ hệ thống thực tế.

Toàn bộ bài tập được tổ chức thành các thư mục riêng:

- `BT1_C5`: Ứng dụng tính lương bằng `interface`.
- `BT2_C5`: Tìm kiếm sách bằng `interface Search`.
- `BT3_C5`: Kiểm tra địa chỉ bằng `interface AddressValidator`.
- `BT4_C5`: So sánh cài đặt bằng `abstract class` và `interface`.
- `BTL_C6`: Ứng dụng mẫu thiết kế `Factory` và `Singleton` cho hệ thống bán sách online.

## 2. Bài 1 - Ứng dụng tính và hiển thị lương nhân viên

### Đề bài

Sử dụng khái niệm `interface` để xây dựng ứng dụng tính lương cho nhiều loại nhân viên trong doanh nghiệp phần mềm. Dịch vụ tính lương được cung cấp bởi `getSalary()` của `SalaryCalculator`. Lớp `Employee` triển khai interface này và cài đặt phương thức `display()`. Lương được tính theo công thức lương cơ bản cộng với lương làm thêm giờ.

### Cách triển khai

Bài này đã được triển khai trong thư mục `BT1_C5` với các thành phần chính:

- `SalaryCalculator.java`: khai báo phương thức `getSalary()`.
- `Employee.java`: lớp cơ sở chứa thông tin chung như tên, vai trò và số giờ làm thêm; đồng thời cung cấp `display()`.
- `CategoryA.java`, `CategoryB.java`, `CategoryC.java`: các lớp cụ thể cho từng nhóm nhân viên, tự cài đặt công thức tính lương theo đề bài.
- `MainApp.java`: khởi tạo nhiều nhân viên mẫu và hiển thị kết quả tính lương.
- `UML/UML.png`: biểu đồ UML mô tả quan hệ giữa interface và các lớp.

### Kết quả đạt được

Hệ thống đã thể hiện đúng ý tưởng đa hình thông qua `interface SalaryCalculator`. Mỗi loại nhân viên có thể sử dụng cùng một giao diện nhưng có cách tính lương riêng. Phần hiển thị dữ liệu được đưa về lớp chung `Employee`, giúp tái sử dụng mã nguồn và giữ cho chương trình ngắn gọn.

## 3. Bài 2 - Thiết kế interface Search cho tìm kiếm sách

### Đề bài

Thiết kế `interface Search` để khai báo phương thức tìm một mặt hàng như sách `Book` trong danh sách. Cài đặt hai cách tìm kiếm gồm `BinarySearch` và `LinearSearch`.

### Cách triển khai

Bài này đã được thực hiện trong thư mục `BT2_C5`:

- `Book.java`: mô tả đối tượng sách với mã sách và tên sách.
- `Search.java`: khai báo phương thức `search(...)`.
- `LinearSearch.java`: cài đặt tìm kiếm tuần tự.
- `BinarySearch.java`: cài đặt tìm kiếm nhị phân.
- `MainApp.java`: tạo danh sách sách, chạy thử cả hai giải thuật và in kết quả ra màn hình.

### Kết quả đạt được

Ứng dụng đã mô hình hóa thành công việc tách riêng chiến lược tìm kiếm khỏi dữ liệu sách. `LinearSearch` hoạt động trên danh sách ban đầu, trong khi `BinarySearch` được sử dụng sau khi danh sách đã sắp xếp. Cách làm này giúp thấy rõ lợi ích của `interface`: có thể thay đổi thuật toán tìm kiếm mà không cần thay đổi cấu trúc chung của chương trình.

## 4. Bài 3 - Thiết kế interface AddressValidator

### Đề bài

Thiết kế `interface AddressValidator` để xác nhận các thành phần của một địa chỉ. Cài đặt hai lớp `USAAddress` và `VNAddress` để xác thực địa chỉ cho Hoa Kỳ và Việt Nam.

### Cách triển khai

Phần bài tập này đã được cài đặt trong `BT3_C5`:

- `AddressValidator.java`: khai báo các hàm kiểm tra đường, thành phố, bang/tỉnh và mã bưu chính.
- `USAAddress.java`: cài đặt quy tắc xác thực địa chỉ Hoa Kỳ.
- `VNAddress.java`: cài đặt quy tắc xác thực địa chỉ Việt Nam.
- `MainApp.java`: chạy thử với các bộ dữ liệu hợp lệ và không hợp lệ.

### Kết quả đạt được

Chương trình đã thể hiện thành công việc dùng chung một giao diện cho nhiều bộ quy tắc xác thực khác nhau. Thông qua đó, bài tập làm rõ cách `interface` giúp trừu tượng hóa hành vi và giữ cho từng quốc gia có thể tự định nghĩa quy tắc riêng mà vẫn thống nhất về cấu trúc sử dụng.

## 5. Bài 4 - Cài đặt Employee bằng abstract class và interface

### Đề bài

Trong doanh nghiệp, nhân viên được tổ chức theo mô hình phân cấp gồm `Employee`, `SalesRep`, `Consultant`... Yêu cầu:

- Lưu và hiển thị dữ liệu nhân viên.
- Truy cập các thuộc tính như `id`, `name`.
- Tính thu nhập hàng tháng.

Đề bài yêu cầu cài đặt theo hai hướng:

- Sử dụng `abstract class`.
- Sử dụng `interface`.

Sau đó so sánh hai cách tiếp cận.

### Cách triển khai

Bài này đã được chia thành hai nhóm thư mục trong `BT4_C5`:

- `abtract/`: cài đặt theo hướng `abstract class`, trong đó `Employee` chứa dữ liệu chung và phương thức hiển thị, còn `SalesRep`, `Consultant` chỉ cần bổ sung phần tính thu nhập.
- `interfaces/`: cài đặt theo hướng `interface`, trong đó `IEmployee` chỉ khai báo các hành vi và mỗi lớp cụ thể phải tự cài đặt đầy đủ.
- `compare.md`: tổng hợp phần so sánh giữa hai cách thiết kế.

### Kết quả đạt được

Qua quá trình cài đặt, bài tập cho thấy `abstract class` phù hợp hơn với trường hợp các đối tượng có chung dữ liệu và chung một phần hành vi. Trong khi đó, cách dùng `interface` vẫn thực hiện được yêu cầu nhưng bị lặp lại mã nguồn nhiều hơn. Phần so sánh đã làm rõ ưu điểm và giới hạn của từng hướng tiếp cận để phục vụ việc học tập và đối chiếu.

## 6. BTL C6 - Áp dụng Factory và Singleton cho hệ thống bán sách online

### Đề bài

Xây dựng các mẫu thiết kế `Factory` và `Singleton` cho hệ thống bán sách online. Yêu cầu chỉ thiết kế và cài đặt mẫu, không lập trình toàn bộ hệ thống.

### Cách triển khai

Nội dung này đã được xây dựng trong thư mục `BTL_C6` với hướng mô phỏng các chức năng cơ bản của hệ thống bán sách:

- Quản lý thông tin sách.
- Đặt mua sách online.
- Lựa chọn phương thức thanh toán.
- Quản lý thông tin cấu hình chung của cửa hàng.

Bộ file chính gồm:

- `Book.java`: mô tả đối tượng sách.
- `PaymentMethod.java`: interface chung cho các hình thức thanh toán.
- `CashOnDeliveryPayment.java`, `CreditCardPayment.java`, `EWalletPayment.java`: các lớp thanh toán cụ thể.
- `PaymentFactory.java`: tạo đối tượng thanh toán dựa trên loại mà người dùng chọn.
- `StoreConfig.java`: cài đặt `Singleton` để quản lý tên cửa hàng, phí giao hàng và hotline.
- `OrderService.java`: xử lý checkout đơn giản và kết hợp sử dụng cả `Factory` và `Singleton`.
- `Main.java`: chương trình demo.
- `README.md`: mô tả riêng cho bài `BTL_C6`.

### Kết quả đạt được

Bài tập đã thể hiện thành công hai mẫu thiết kế:

- `Factory` giúp gom logic tạo đối tượng thanh toán vào một điểm trung tâm, tránh việc khởi tạo trực tiếp trong phần xử lý đơn hàng.
- `Singleton` đảm bảo cấu hình của hệ thống chỉ tồn tại một bản duy nhất và được dùng chung trong toàn bộ chương trình.

Qua phần demo, hệ thống có thể tạo đơn hàng, chọn phương thức thanh toán phù hợp và sử dụng cùng một đối tượng cấu hình cho mọi lần xử lý.

## 7. Đánh giá tổng kết

Sau khi hoàn thành các bài tập, có thể thấy các nội dung chính đã đạt được:

- Vận dụng `interface` để trừu tượng hóa hành vi chung.
- Vận dụng `abstract class` để tái sử dụng dữ liệu và hành vi chung.
- Hiểu và áp dụng được mẫu thiết kế `Factory` và `Singleton` vào một bài toán gần với thực tế.
- Tổ chức chương trình thành các thành phần rõ ràng, dễ đọc và dễ mở rộng.

Nhìn chung, các bài tập đã được triển khai thành công đúng theo hướng đề bài yêu cầu. Mỗi bài đều tập trung vào một kỹ thuật thiết kế hướng đối tượng cụ thể, giúp làm rõ sự khác nhau giữa các cách tiếp cận và nâng cao khả năng phân tích, tổ chức mã nguồn trong Java.
