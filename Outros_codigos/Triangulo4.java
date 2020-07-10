import java.util.Scanner;
public class Triangulo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0, j = 0;
        double a, b;
        while(scan.hasNext()) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            if (a > 90 || b > 90 || (180 - a - b) > 90) {
                System.out.println("obtusangulo");
            } else if (a < 90 && b < 90 && (180 - a - b) < 90) {
                System.out.println("acutangulo");
            } else {
                System.out.println("retangulo");
            }
        }
    }
}