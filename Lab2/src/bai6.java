import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("La do dai 3 canh tam giac");
        } else {
            System.out.println("Khong phai tam giac");
        }
    }
}
