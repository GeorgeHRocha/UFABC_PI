import java.util.Scanner;
public class OrdenaBubble {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10000];
        int n, i = 0, j = 1, aux, k = 0, l = 0, troca = 0;
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i < n) {
            if (i + 1 < n) {
                System.out.print(vet[i] + " ");
            } else {
                System.out.println(vet[i]);
            }
            i++;
        }
        i = 0;
        while (k < n) {
            while (j < n - k) {
                if (vet[i] > vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                    troca = troca + 1;
                    while (l < n) {
                        if (l + 1 < n) {
                            System.out.print(vet[l] + " ");
                        } else {
                            System.out.println(vet[l]);
                        }
                        l++;
                    }
                    l = 0;
                }
                i = i + 1;
                j = j + 1;
            }
            k = k + 1;
            i = 0;
            j = 1;
        }
        while (l < n) {
            if (l + 1 < n) {
                System.out.print(vet[l] + " ");
            } else {
                System.out.println(vet[l]);
            }
            l++;
        }
        System.out.println("Trocas: " + troca);
    }
}