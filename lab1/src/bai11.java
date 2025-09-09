import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        System.out.print("Nhap b: ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
    }
}
