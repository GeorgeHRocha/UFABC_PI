import java.util.Scanner;
public class DiagSec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0;
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
            System.out.println(mat[i][n - 1 - i]);
            i++;
        }
    }
}