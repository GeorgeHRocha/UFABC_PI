import java.util.Scanner;
public class SomaMatriz2 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, soma = 0;
        n = scan.nextInt();
        int mat[][] = new int[n][n];
        while (i < n) {
            while (j < n) {
                mat[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        while (j < n) {
            soma = soma + somaMat(mat[j], n);
            j++;
        }
        System.out.println(soma);
    }
    public static int somaMat(int vet[], int n) {
        int i = 0, soma = 0;
        while (i < n) {
            soma = soma + vet[i];
            i++;
        }
        return soma;
    }
}