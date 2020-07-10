import java.util.Scanner;
public class Triangulo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;
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