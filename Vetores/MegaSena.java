import java.util.Scanner;
public class MegaSena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, num, k = 0;
        do {
            n = scan.nextInt();
        } while (n > 61);
        int vet[] = new int[n];
        while (i < n) {
            do {
                k = 0;
                num = (int)(Math.random() * 61);
                while (k < i && vet[k] != num) {
                    k++;
                }
            } while (k < i);
            vet[i] = num;
            i++;
        }
        ordena(n, vet);
        i = 0;
        while (i < n) {
            System.out.print(vet[i] + (i + 1 < n ? " " : "\n"));
            i++;
        }
    }
    public static void ordena (int n, int vet[]) {
        int i = 0, j = 1, aux;
        while (i + 1 < n) {
            while(j < n) {
                if(vet[j] < vet[i]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
    }
}