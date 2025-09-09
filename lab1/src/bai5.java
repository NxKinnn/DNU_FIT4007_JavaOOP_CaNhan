import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        int namSinh = 2023 - tuoi;
        System.out.println("Nam sinh: " + namSinh);
    }
}
