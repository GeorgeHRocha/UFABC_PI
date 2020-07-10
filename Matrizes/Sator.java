import java.util.Scanner;
public class Sator {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0;
        char mat[][] = new char [12][12];
        n = scan.nextInt();
        while (n > 0) {     
            while (i < n) {
                while (j < n) {
                    mat[i][j] = scan.next().charAt(0);
                    j++;
                }
                i++;
                j = 0;
            }
            if (!sator(mat, n)) {
                System.out.println('N');
            } else {
                System.out.println('S');
            }
            i = j = 0;
            n = scan.nextInt();
        }
    }
    public static boolean sator (char mat[][], int n) {
        int i = 0, j = 0;
        while (i < n) {
            while (j < n) {
                if (i > n - 1 - i || (i == n - 1 - i && j == n - 1 - j )) {
                    return true;
                }
                if (mat[i][j] != mat[n - 1 - i][n - 1 - j]) {
                    return false;
                } 
                j = j + 1;
            }
            i = i + 1;
            j = 0;
        }
        return true;
    }
}