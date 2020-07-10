import java.util.Scanner;
public class Conceito {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        int f, m;
        x = scan.nextDouble();
        m = scan.nextInt();
        f = scan.nextInt();
        if (m > f) {
            System.out.println("O");
        } else {
            if (x >= 8.5) {
                System.out.println("A");
            } else if (x >= 7) {
                System.out.println("B");
            } else if (x >= 6) {
                System.out.println("C");
            } else if (x >= 5) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}