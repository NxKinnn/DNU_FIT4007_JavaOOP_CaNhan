import java.util.Scanner;

public class VidDu8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean ok = (N > 0) && ((N & (N - 1)) == 0);
        System.out.println(ok ? "YES" : "NO");
    }
}
