import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("Nhập k (0 <= k < N): ");
        int k = sc.nextInt();

        System.out.println("Mảng sau khi xoá phần tử tại chỉ số " + k + ":");
        for (int i = 0; i < n; i++) {
            if (i != k) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
