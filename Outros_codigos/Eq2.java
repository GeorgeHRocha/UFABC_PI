import java.util.Scanner;
import java.text.DecimalFormat;
public class Eq2 {
    public static void main(String[] args) {
        int a, b, c;
        double dmais, dmenos;
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0000");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        dmais = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
        dmenos = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
        System.out.println(decimal.format(dmais) + " " + decimal.format(dmenos));
    }
}