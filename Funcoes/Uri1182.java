import java.util.Scanner;
public class Uri1182 {
    static Scanner scan = new Scanner(System.in);
    public static final int N = 12;
    public static void main (String[] args) {
        int c;
        double m [][] = new double [N][N];
        char ch;
        c = scan.nextInt();
        ch = scan.next().charAt(0);
        lerMatriz(m, N);
        System.out.printf("%.1f\n", coluna(c, ch, m, N));
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
    public static double coluna(int c, char ch, double m[][], int n) {
        int i = 0;
        double soma = 0;
        while(i < n) {
            soma = soma + m[i][c];
            i++;
        }
        if(ch == 'M') {
            soma = soma / n;
        }
        return soma;
    }
}