import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        boolean nonDecreasing = true;
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                nonDecreasing = false;
                break;
            }
        }

        if (nonDecreasing) {
            System.out.println("Mảng là mảng không giảm.");
        } else {
            System.out.println("Mảng KHÔNG phải mảng không giảm.");
        }
    }
}
