import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Nhập a:");
        int a = myScanner.nextInt();

        System.out.println("Nhập b:");
        int b = myScanner.nextInt();

        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + ((float) a / b));
    }
}
