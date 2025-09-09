import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        char ch = sc.next().charAt(0);
        char nextCh = (char)(ch + 1);
        System.out.println("Ky tu lien sau la: " + nextCh);
    }
}
