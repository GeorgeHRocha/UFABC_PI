import java.util.Scanner;
public class ProdMat {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, k = 0;
        n = scan.nextInt();
        int mat1[][] = new int [n][n];
        int mat2[][] = new int [n][n];
        int matR[][] = new int [n][n];
        while (i < n) {
            while (j < n) {
                mat1[i][j]= scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = j = 0;
        while (i < n) {
            while (j < n) {
                mat2[i][j]= scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = j = 0;
        while (i < n) {
            while (j < n) {
                while (k < n) {
                    matR[i][j] = matR[i][j] + mat1[i][k] * mat2[k][j];
                    k++;
                }
                j++;
                k = 0;
            }
            i++;
            j = 0;
        }
        i = j = 0;
        while (i < n) {
            while (j < n) {
                System.out.print(matR[i][j] + (j + 1 < n ? " " : "\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
}