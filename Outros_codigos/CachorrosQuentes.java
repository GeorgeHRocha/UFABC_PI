import java.util.Scanner;
import java.text.DecimalFormat;
public class CachorrosQuentes {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        double h, p, m;
        h = scan.nextInt();
        p = scan.nextInt();
        m = h / p;
        System.out.println(decimal.format(m));
    }
}