import java.util.Scanner;
import java.text.DecimalFormat;

public class Mediana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.00");
        int[] vet = new int[1000000];
        int i = 0, n, j = 0, aux;
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i + 1 < n) {
            while (j < n) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
                j = j + 1;
            }
            i = i + 1;
            j = i + 1;
        }
        if (n % 2 == 0) {
            System.out.println(decimal.format((vet[(n - 1) / 2] + vet[n / 2]) / 2f));
        } else {
            System.out.println(decimal.format(vet[n / 2]));
        }
    }
}
