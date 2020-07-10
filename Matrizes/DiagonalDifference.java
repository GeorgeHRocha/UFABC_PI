import java.util.Scanner;
public class DiagonalDifference {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, dp = 0, ds = 0;
        n = scan.nextInt();
        int mat[][] = new int [n][n];
        while (i < n) {
            while(j < n) {
                mat[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        while (i < n) {
            dp = dp + mat[i][i];
            ds = ds + mat[i][n - 1- i];
            i++;
        }
        System.out.println(Math.abs(dp - ds));
    }
}