import java.util.Scanner;
public class CampoMinado {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        int n, nBomba, matR[][], i = 0, j = 0;
        n = scan.nextInt();
        nBomba = scan.nextInt();
        matR = cria_campos(n, nBomba);
        while (i < n) {
            while (j < n) {
                System.out.print(matR[i][j] + (j + 1 < n ? " ": "\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
    public static int [][] cria_campos (int n, int nBomba) {
        int mat[][] = new int [n][n];
        int mat2[][] = new int [nBomba][2];
        int i = 0, j = 0, l, c, f = 0, g = 0;
        while (i < nBomba) {
            l = (int)(Math.random() * n);
            c = (int)(Math.random() * n);
            if (mat[l][c] != -1) {
                mat[l][c] = -1;
            } else {
                i--;
            }
            i++;
        }
        i = j = 0;
        while (i < n) {
            while (j < n) {
                if (mat[i][j] == -1) {
                    f = i - 1;
                    g = j - 1;
                    while (f <= i + 1) {
                        while (g <= j + 1) {
                            if (f >= 0 && f < n && g >= 0 && g < n) {
                                if(mat[f][g] != -1) {
                                    mat[f][g]++;
                                }
                            }
                            g++;
                        }
                        f++;
                        g = j - 1;
                    }
                }
                j++;
            }
            i++;
            j = 0;
        }
        return mat;
    }
}