import java.util.Scanner;
import java.text.DecimalFormat;
public class MediaPonderada {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        double x, y, w;
        x = scan.nextDouble();
        y = scan.nextDouble();
        w = scan.nextDouble();
        System.out.println(decimal.format((x * w) + (y * (1 - w))));
    }
}