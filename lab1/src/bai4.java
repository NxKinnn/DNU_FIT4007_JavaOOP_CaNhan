import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap canh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap canh c: ");
        double c = sc.nextDouble();

        double chuVi = a + b + c;
        double p = chuVi / 2;
        double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi tam giac: " + chuVi);
        System.out.println("Dien tich tam giac: " + dienTich);
    }
}
