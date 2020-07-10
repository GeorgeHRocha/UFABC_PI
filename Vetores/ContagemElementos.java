import java.util.Scanner;
public class ContagemElementos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet [] = new int [10000];
        int count [] = new int [10001];
        int n, i = 0, maior;
        n = scan.nextInt();
        while (n > 0) {
            while (i < n) {
                vet[i] = scan.nextInt();
                i = i + 1;
            }
            i = 0;
            maior = vet[i];
            while (i < n) {
                if(vet[i] > maior) {
                    maior = vet[i];
                }
                count[vet[i]]++;
                i = i + 1;
            }
            i = 0;
            while(i <= maior) {
                System.out.println("[" + i + "] " + count[i]);
                i = i + 1;
            }
            i = 0;
            while (i <= maior) {
                count[i] = 0;
                i = i + 1;
            }
            i = 0;
            n = scan.nextInt();
        }
    }
}