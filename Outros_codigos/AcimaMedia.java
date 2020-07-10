import java.util.Scanner;
import java.text.DecimalFormat;

public class AcimaMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.000");
        int n, i = 0, media = 0, acima = 0;
        int vet[] = new int[1000];
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            media = media + vet[i];
            i = i + 1;
        }   
        media = media / n;
        i = 0;
        while (i < n) {
            if (vet[i] > media) {
                acima = acima + 1;
            }
            i = i + 1;
        }
        System.out.println(decimal.format((acima * 100f) / n ) + "%");
    }
}
