import java.util.Scanner;

public class OrdenaNumeros1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, aux, j = 0;
        n = scan.nextInt();
        int vet[] = new int[n];
        while (i < n) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i < n) {
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
        i = 0;
        while (i < n) {
            if (i + 1 < n) {
                System.out.print(vet[i] + " ");
            } else {
                System.out.println(vet[i]);
            }
            i = i + 1;
        }
    }
}
