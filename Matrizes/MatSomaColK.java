import java.util.Scanner;
public class MatSomaColK {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n, k, i = 0, j = 0, soma = 0;
        n = scan.nextInt();
        k = scan.nextInt();
        int mat[][] = new int [n][n];
        while (i < n) {
            while (j < n) {
                mat[i][j]= scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        j = k;
        i = 0;
        while (i < n) {
            soma = soma + mat[i][k];
            i++;
        }
        System.out.println(soma);
    }
}