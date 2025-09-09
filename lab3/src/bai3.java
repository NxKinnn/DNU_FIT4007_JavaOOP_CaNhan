import java.util.Scanner;

public class VidDu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char dir = sc.next().charAt(0);
        switch (dir) {
            case 'N': System.out.println("Bắc"); break;
            case 'S': System.out.println("Nam"); break;
            case 'W': System.out.println("Tây"); break;
            case 'E': System.out.println("Đông"); break;
            default: System.out.println("Không hợp lệ");
        }
    }
}
