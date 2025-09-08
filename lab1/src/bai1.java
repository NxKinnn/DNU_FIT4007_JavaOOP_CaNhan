import java.util.Scanner;

public class ViDu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt();

        // Tính toán
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = 0; // Dùng double để chia chính xác
        if (b != 0) {
            thuong = (double) a / b;
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        // Xuất kết quả
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        if (b != 0) {
            System.out.println("Thương: " + thuong);
        }
    }
}
