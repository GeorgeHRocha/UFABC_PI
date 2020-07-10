import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[100000];
        int i = 0, n, k, maior = 0;
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        k = scan.nextInt();
        i = 0;
        while (i < n) {
            if (vet[i] >= k) {
                maior = maior + 1;
            }
            i = i + 1;
        }
        System.out.println(maior);
    }
}
