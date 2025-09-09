import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong = sc.nextDouble();

        double chuVi = 2 * (dai + rong);
        double dienTich = dai * rong;

        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
    }
}

