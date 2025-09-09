import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if (score >= 0 && score <= 10) {
            System.out.println("Diem hop li");
        } else {
            System.out.println("Diem khong hop li");
        }
    }
}
