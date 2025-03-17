public class B2 {
    /*
    * Định nghĩa tính trừu tượng:
    Tính trừu tượng (Abstraction) là một nguyên lý trong lập trình hướng đối tượng cho phép tập trung vào các đặc điểm thiết yếu của đối tượng mà ẩn đi các chi tiết phức tạp bên trong. Nó giúp người lập trình có thể xử lý đối tượng ở mức khái niệm, không cần quan tâm đến cách thức triển khai cụ thể. Tính trừu tượng đóng vai trò then chốt trong việc quản lý độ phức tạp của hệ thống và tạo ra code dễ bảo trì, mở rộng.
    Phân tích tại sao cần tính trừu tượng:
    Quản lý độ phức tạp: Trong các phần mềm lớn, tính trừu tượng giúp chia nhỏ vấn đề phức tạp thành các thành phần đơn giản hơn
    Tái sử dụng code: Cho phép tạo các template chung có thể được tái sử dụng nhiều lần
    Bảo mật: Ẩn các chi tiết triển khai, chỉ cho phép truy cập thông qua các phương thức public
    Dễ bảo trì: Thay đổi code bên trong không ảnh hưởng đến code bên ngoài sử dụng interface
    Sự khác biệt giữa lớp trừu tượng và giao diện:
    Lớp trừu tượng (Abstract Class):

    Có thể có các phương thức cụ thể và trừu tượng
    Có thể có các thuộc tính
    Một lớp chỉ có thể kế thừa một lớp trừu tượng
    Có thể có constructor
    Giao diện (Interface):

    Chỉ chứa các phương thức trừu tượng (trước Java 8)
    Không có thuộc tính (chỉ có hằng số)
    Một lớp có thể implements nhiều interface
    Không có constructor
    Ví dụ thực tế về tính trừu tượng:
    Máy ATM:


    public interface ATMMachine {
        boolean validateCard(String cardNumber, String pin);
        double checkBalance();
        boolean withdraw(double amount);
        void printReceipt();
    }

    public class CitibankATM implements ATMMachine {
        @Override
        public boolean validateCard(String cardNumber, String pin) {
            // Chi tiết xác thực thẻ
            return true;
        }

        @Override
        public double checkBalance() {
            // Chi tiết kiểm tra số dư
            return 1000.0;
        }

        // Các phương thức khác...
    }
        Người dùng chỉ cần biết các thao tác cơ bản (rút tiền, kiểm tra số dư) mà không cần hiểu cơ chế bên trong máy ATM hoạt động như thế nào.

    Ưu điểm và hạn chế:
    Ưu điểm:

    Giảm độ phức tạp của code
    Tăng tính bảo mật
    Dễ dàng bảo trì và nâng cấp
    Tái sử dụng code hiệu quả

    Hạn chế:
    Có thể tăng độ phức tạp khi thiết kế ban đầu
    Đôi khi khó xác định mức độ trừu tượng phù hợp
    Có thể ảnh hưởng đến hiệu suất nếu thiết kế không tốt
    * */
}
