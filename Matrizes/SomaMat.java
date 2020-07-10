import java.util.Scanner;
public class SomaMat {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0;
        n = scan.nextInt();
        int mat1 [][] = new int [n][n];
        int mat2 [][] = new int [n][n];
        while (i < n) {
            while (j < n) {
                mat1[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = j = 0;
        while (i < n) {
            while (j < n) {
                mat2[i][j] = scan.nextInt();
                j++;
            }
            i++;
            j = 0;
        }
        i = j = 0;
        while (i < n) {
            while (j < n) {
                System.out.print(mat1[i][j] + mat2[i][j] + (j + 1 < n?" ":"\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
}