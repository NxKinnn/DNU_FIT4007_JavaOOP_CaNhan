import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("So lon hon la: " + a);
        } else {
            System.out.println("So lon hon la: " + b);
        }
    }
}
