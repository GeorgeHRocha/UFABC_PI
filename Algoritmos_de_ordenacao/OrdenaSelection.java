import java.util.Scanner;
public class OrdenaSelection {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10000];
        int n, i = 0, j = 1, iMenor = 0, aux, k = 0, qtd = 0;;
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
        while (i < n) {
            while (j < n) {
                if (vet[iMenor] > vet[j]) {
                    iMenor = j;
                    j = iMenor + 1;
                    qtd = qtd + 1;
                } else {
                    j = j + 1;
                }
            }
            aux = vet[i];
            vet[i] = vet[iMenor];
            vet[iMenor] = aux;
            while (k < n) {
                if (k + 1 < n) {
                    System.out.print(vet[k] + " ");
                } else {
                    System.out.println(vet[k]);
                }
                k++;
            }
            k = 0;
            i = i + 1;
            iMenor = i;
            j = iMenor + 1;
        }
        System.out.println(qtd);
    }
}