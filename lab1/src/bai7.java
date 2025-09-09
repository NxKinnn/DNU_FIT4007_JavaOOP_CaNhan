import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        int n = sc.nextInt();
        int nearLastDigit = Math.abs((n / 10) % 10);
        System.out.println("Chu so gan cuoi: " + nearLastDigit);
    }
}
