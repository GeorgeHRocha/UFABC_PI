import java.util.Scanner;
public class GeraMatriz2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int l, c, i = 0, j = 0, n, v = 0;
        l = scan.nextInt();
        c = scan.nextInt();
        int mat[][] = new int [l][c];
        int vet[] = new int [l * c];
        while (i < l) {
            while (j < c) {
                do {
                    v = 0;
                    n = (int)(Math.random() * (l * c + 1));
                    while (v < i + j + i * (c - 1) && n != vet[v]) {
                        v++;
                    }
                } while (v < i + j + i * (c - 1));
                mat[i][j] = n;
                vet[v] = n;
                j++;
            }
            i++;
            j = 0;
        }
        i = j = 0;
        while (i < l) {
            while (j < c) {
                System.out.print(mat[i][j] + (j + 1 < c ? " " : "\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
}