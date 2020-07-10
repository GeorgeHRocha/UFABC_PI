import java.util.Scanner;
import java.text.DecimalFormat;
public class AbaixoDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("0.0");
        char c;
        int n, i = 0, j = 0, soma = 0, n2 = 0;
        c = scan.next().charAt(0);
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
        i = j = 0;
        while (i < n) {
            while (j < n && i != j) {
                soma = soma + mat[i][j];
                n2++;
                j++;
            }
            i++;
            j = 0;
        }
        if (c == 'S') {
            System.out.println(decimal.format(soma));
        } else {
            System.out.println(decimal.format(soma / (double)n2));
        }
    }
}