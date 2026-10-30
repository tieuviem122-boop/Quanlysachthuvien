import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // ==========================================
        // BÀI 1: Nhập thông tin sách và hiển thị lại
        // ==========================================
        System.out.println("=== NHẬP THÔNG TIN SÁCH ===");
        
        System.out.print("1. Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("2. Nhập tên sách: ");
        String tenSach = sc.nextLine();

        System.out.print("3. Nhập tác giả: ");
        String tacGia = sc.nextLine();

        System.out.print("4. Nhập năm xuất bản: ");
        int namXuatBan = sc.nextInt();

        System.out.print("5. Nhập đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.print("6. Nhập số lượng: ");
        int soLuong = sc.nextInt();

        // Hiển thị lại thông tin sách vừa nhập
        System.out.println("\n=== THÔNG TIN SÁCH (BÀI 1) ===");
        System.out.println("Mã sách      : " + maSach);
        System.out.println("Tên sách     : " + tenSach);
        System.out.println("Tác giả      : " + tacGia);
        System.out.println("Năm xuất bản : " + namXuatBan);
        System.out.println("Đơn giá      : " + donGia);
        System.out.println("Số lượng     : " + soLuong);

        // ==========================================
        // BÀI 2: Tính thành tiền = đơn giá × số lượng
        // ==========================================
        double thanhTien = donGia * soLuong;

        // ==========================================
        // BÀI 3: Phí vận chuyển = 5% giá trị sách
        // ==========================================
        double phiVanChuyen = thanhTien * 0.05;

        // ==========================================
        // BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        // ==========================================
        double tongTienNhap = thanhTien + phiVanChuyen;

        // Hiển thị kết quả của Bài 2, Bài 3, Bài 4
        System.out.println("\n=== TÍNH GIÁ TRỊ NHẬP KHO (BÀI 2, 3, 4) ===");
        System.out.println("Thành tiền (Bài 2)     : " + thanhTien);
        System.out.println("Phí vận chuyển (Bài 3) : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập (Bài 4) : " + tongTienNhap);

        // Đóng Scanner sau khi dùng xong
        sc.close();
    }
}