import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        boolean found = false;
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("Các số chia hết cho 5:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 5 == 0) {
                System.out.print(a[i] + " ");
