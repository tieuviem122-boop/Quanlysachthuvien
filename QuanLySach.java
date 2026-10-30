import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("\n=== THÔNG TIN SÁCH (BÀI 1) ===");
        System.out.println("Mã sách      : " + maSach);
        System.out.println("Tên sách     : " + tenSach);
        System.out.println("Tác giả      : " + tacGia);
        System.out.println("Năm xuất bản : " + namXuatBan);
        System.out.println("Đơn giá      : " + donGia);
        System.out.println("Số lượng     : " + soLuong);

        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n=== TÍNH GIÁ TRỊ NHẬP KHO (BÀI 2, 3, 4) ===");
        System.out.println("Thành tiền (Bài 2)     : " + thanhTien);
        System.out.println("Phí vận chuyển (Bài 3) : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập (Bài 4) : " + tongTienNhap);

        sc.close();
    }
}