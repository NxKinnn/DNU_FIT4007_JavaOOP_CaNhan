import java.util.Scanner;

public class VidDu12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean isPrime = N > 1;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "YES" : "NO");
    }
}
