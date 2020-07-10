import java.util.Scanner;
public class OrdenaInsertion {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[10000];
        int n, i = 0, j, aux, k = 0, entrou = 0, total = 0;
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
        i = j = 1;
        while(i < n) {
            while(j > 0) {
                if(vet[j] < vet[j - 1]) {
                    aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                    while (k < n) {
                        if (k + 1 < n) {
                            System.out.print(vet[k] + " ");
                        } else {
                            System.out.println(vet[k]);
                        }
                        k++;
                    }
                    entrou = entrou + 1;
                    k = 0;
                }
                total = total + 1;
                j = j - 1;
            }
          i = i + 1;  
          j = i;
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
        System.out.println("Trocas:" + entrou);
        if(entrou == total) {
            System.out.println("PIOR CASO");
        } else if(entrou == 0) {
            System.out.println("MELHOR CASO");
        } else {
            System.out.println("CASO ALEATORIO");
        }
    }
}