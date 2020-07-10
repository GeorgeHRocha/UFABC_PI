import java.util.Scanner;
public class OrdemAltura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, d;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();
        if (a >= b && b >= c && c >= d) {
            System.out.println("SIM");
        } else if (a <= b && b <= c && c <= d) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}