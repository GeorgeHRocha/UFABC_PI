import java.util.Scanner;
public class Pacman {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        int n, i = 0, j = 0;
        n = scan.nextInt();
        char mapa [][] = new char [n][n];
        String c;
        while (i < n) {
            c = scan.next();
            while (j < n) {
                mapa[i][j] = c.charAt(j);
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println(calculaMax(mapa, n));
    }
    public static int calculaMax(char mat[][], int n) {
        int i = 0, j = 0, comida = 0, max = 0, c;
        while (i < n) {
            while (j < n) {
                if (i % 2 == 0) {
                    c = j;
                } else {
                    c = n - 1 - j;
                }
                if (mat[i][c] == 'o') {
                    comida++;
                } else if (mat[i][c] == 'A') {
                    comida = 0;
                }
                if (comida > max) {
                    max = comida;
                }
                j++;
            }
            i++;
            j = 0;
        }
        return max;
    }
}