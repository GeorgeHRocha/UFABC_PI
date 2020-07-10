import java.util.Scanner;
public class OrdenaMatriz {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
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
        ordena(n, mat);
        i = j = 0;
        while (i < n) {
            while (j < n) {
                System.out.print(mat[i][j] + (j + 1 < n ? " " : "\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
    public static void ordena (int n, int mat[][]) {
        int i = 0, j = 0, f = 0, g = 1, aux;
        while(i < n) {
            while (j < n) {
                while(f < n) {
                    while(g < n) {
                        if (mat[f][g] < mat[i][j]) {
                            aux = mat[i][j];
                            mat[i][j] = mat[f][g];
                            mat[f][g] = aux;
                        }
                        g++;
                    }
                    f++;
                    g = 0;
                }
                j++;
                f = i;
                g = j + 1;
            }
            i++;
            j = 0;
        }
    }
}