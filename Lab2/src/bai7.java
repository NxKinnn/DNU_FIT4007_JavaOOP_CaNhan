import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("La 3 goc cua tam giac");
        } else {
            System.out.println("Khong phai tam giac");
        }
    }
}
