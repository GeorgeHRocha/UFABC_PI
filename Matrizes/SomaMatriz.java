import java.util.Scanner;
public class SomaMatriz {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        int n, i = 0, j = 0;
        n = scan.nextInt();
        int mat[][] = new int [n][n];
        while (i < n) {
            while (j < n) {
                mat[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println(somaMat(mat, n));
        
    }
    public static int somaMat (int mat[][], int n) {
        int i = 0, j = 0, soma = 0;
        while (i < n) {
            while (j < n) {
                soma = soma + mat[i][j];
                j++;
            }
            i++;
            j = 0;
        }
        return soma;
    }
}