import java.util.Scanner;
public class Uri1189 {
	static Scanner scan = new Scanner(System.in);
    public static final int N = 12;
    public static void main (String[] args) {
        char ch;
        ch = scan.next().charAt(0);
        double m[][] = new double [N][N];
        lerMatriz(m, N);
        System.out.printf("%.1f\n", calc(ch, m, N));
    }
	public static void lerMatriz(double mat[][], int n) {
		int i = 0, j = 0;
		while (i < n) {
            while(j < n) {
                mat[i][j] = scan.nextDouble();
                j++;
            }
            i++;
            j = 0;
        }
	}
    public static double calc (char ch, double m[][], int n) {
        int i = 1, j = 0, q = 0;
        double soma = 0;
        while(j < n / 2 - 1) {
            while (i < n - 1 - j) {
                soma = soma + m[i][j];
                i++;
                q++;
            }
            j++;
            i = j + 1;
        }
        if (ch == 'M') {
            soma = soma / q;
        }
        return soma;
    }
}