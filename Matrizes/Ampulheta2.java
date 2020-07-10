import java.util.Scanner;
public class Ampulheta2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, maior,soma;
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
        i = j = 1;
        maior = mat[i - 1][j - 1] + mat[i - 1][j] + mat[i - 1][j + 1] + mat[i][j] + mat[i + 1][j - 1] + mat[i + 1][j] + mat[i + 1][j + 1];
        while (i < n - 1) {
            while (j < n - 1) {
                soma = mat[i - 1][j - 1] + mat[i - 1][j] + mat[i - 1][j + 1] + mat[i][j] + mat[i + 1][j - 1] + mat[i + 1][j] + mat[i + 1][j + 1];
                if (soma > maior) {
                    maior = soma;
                }
                j++;
            }
            i++;
            j = 1;
        }
        System.out.println(maior);
    }
}