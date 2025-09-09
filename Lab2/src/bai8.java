import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x == (int)x) {
            System.out.println("La so nguyen");
        } else {
            System.out.println("Khong phai so nguyen");
        }
    }
}
