import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long vet[] = new long[10000], n, aux;
        int i = 0, j = 1;
        n = scan.nextLong();
        while(n > 0) {
            while(i < n) {
                vet[i] = scan.nextLong();
                i = i + 1;
            }
            i = 0;
            while (i + 1 < n) {
                while (j < n) {
                    if(vet[i] > vet[j]) {
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
                System.out.print(i + 1 < n ? vet[i] + " " : vet[i] + "\n"); 
                i = i + 1;
            }
            i = j = 0;
            n = scan.nextLong();
        }
    }
}