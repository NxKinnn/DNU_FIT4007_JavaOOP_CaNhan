import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble();
        double rong = sc.nextDouble();
        if (dai == rong) {
            System.out.println("Day la hinh vuong");
        } else {
            System.out.println("Day khong la hinh vuong");
        }
    }
}
