import java.util.Scanner;
import java.text.DecimalFormat;
public class Caixa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        int n, i= 0;
        n = scan.nextInt();
        float total = 0;
        float [] vet = new float [n];
        String [] car = new String[n];;
        while (i < n) {
            car[i] = scan.next();
            vet[i] = scan.nextFloat();
            i = i + 1;
        }
        i = 0;
        while (i < n) {
            if (car[i].equals("O")) {
                total = total + vet[i];
            } else if (car[i].equals("X")) {
                total = total - vet[i];
            }
            i = i + 1;
        }
        System.out.println(decimal.format(total));
    }
}