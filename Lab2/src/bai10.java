import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a % b == 0 && b % c == 0) {
            System.out.println("b vua la uoc cua a va vua la boi cua c");
        } else {
            System.out.println("Khong thoa man");
        }
    }
}
