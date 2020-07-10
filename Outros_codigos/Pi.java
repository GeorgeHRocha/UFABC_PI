import java.util.Scanner;
import java.text.DecimalFormat;
public class Pi {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000000");
        int m = 0, n, i = 0;
        double x, y;
        n = scan.nextInt();
        while (i < n) {
            x = Math.random();
            y = Math.random();
            if (Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2) <= 0.25 /*(0.25 = 0.5 ^2)*/) {
                m = m + 1;
            }
            i = i + 1;
        }
        System.out.println(decimal.format((4f * m) / n));
    }
}