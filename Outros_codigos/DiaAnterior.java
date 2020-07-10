import java.util.Scanner;
public class DiaAnterior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d, m, a;
        int[] b = new int[]{1, -1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        int[] nb = new int[]{1, -2, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        d = scan.nextInt();
        m = scan.nextInt();
        a = scan.nextInt();
        if ((a % 400) == 0 || ((a % 4) == 0 && (a % 100) != 0)) {
            if (d == 1) {
                if (m == 1) {
                    System.out.println(31 + " " + 12 + " " + (a - 1));
                } else if (m > 1) {
                    System.out.println((30 + b[m - 2]) + " " + (m - 1) + " " + a);
                }
            } else if (d > 1) {
                System.out.println((d - 1) + " " + m + " " + a);
            }
        } else {
            if (d == 1) {
                if (m == 1) {
                    System.out.println(31 + " " + 12 + " " + (a - 1));
                } else if (m > 1) {
                    System.out.println((30 + nb[m - 2]) + " " + (m - 1) + " " + a);
                }
            } else if (d > 1) {
                System.out.println((d - 1) + " " + m + " " + a);
            }
        } 
    }
}