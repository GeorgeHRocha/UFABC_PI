import java.util.Scanner;

public class Acima {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, media = 0, acima = 0, n2;
        int vet[] = new int[1000];
        n2 = scan.nextInt();
        while (j < n2) {
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
            System.out.printf("%.3f%s\n", (acima * 100f) / n, "%");
            media = acima = i = 0;
            j = j + 1;
        }
    }
}
