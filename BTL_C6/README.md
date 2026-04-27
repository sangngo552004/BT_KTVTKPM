# Bài tập mẫu Factory và Singleton cho hệ thống bán sách online

## 1. Các chức năng cơ bản của hệ thống

- Quản lý thông tin sách.
- Đặt mua sách online.
- Chọn phương thức thanh toán.
- Cấu hình thông tin của cửa hàng như phí giao hàng, hotline, tên hệ thống.

## 2. Mẫu Factory được áp dụng như thế nào

Mục đích: tạo dựng đối tượng thanh toan theo lựa chọn của khách hàng mà không cần viết `new` trực tiếp trong phần xử lý đơn hàng.

- `PaymentMethod`: interface chung cho các kiểu thanh toán.
- `CashOnDeliveryPayment`, `CreditCardPayment`, `EWalletPayment`: các lớp cụ thể.
- `PaymentFactory`: tạo đối tượng thanh toan dựa trên mã loại như `COD`, `CARD`, `EWALLET`.

Lợi ích:

- Để mở rộng thêm phương thức thanh toán mới.
- Giảm phụ thuộc giữa phần đặt hàng và các lớp thanh toán cụ thể.

## 3. Mẫu Singleton được áp dụng như thế nào

Mục đích: đảm bảo thông tin cấu hình của hệ thống chỉ có một bản duy nhất trong toàn bộ chương trình.

- `StoreConfig`: chưa tên cửa hàng, phí giao hàng, hotline.
- `getInstance()`: trả về duy nhất một đối tượng cấu hình.

Lợi ích:

- Dữ liệu cấu hình được dùng chung, tránh tạo nhiều bản sao không cần thiết.
- Để quản lý các giá trị dùng chung cho toàn hệ thống.

## 4. Cac file chính

- `Book.java`: mô tả sách.
- `OrderService.java`: xử lý checkout đơn giản.
- `Main.java`: chạy demo để thấy Factory va Singleton họat động.

## 5. Cách chạy

Từ thư mục cha của project, dùng:

```bash
javac BTL_C6/*.java
java BTL_C6.Main
```
