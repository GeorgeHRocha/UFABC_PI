
import java.util.Scanner;
import java.text.DecimalFormat;

public class SomaVet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, soma = 0;
        int vet[] = new int[1000];
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            soma = soma + vet[i];
            i = i + 1;
        }
        System.out.println(soma);
    }
}
