import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int can = (int)Math.sqrt(n);
        if (n > 0 && can * can == n) {
            System.out.println("La so chinh phuong");
        } else {
            System.out.println("Khong phai so chinh phuong");
        }
    }
}
