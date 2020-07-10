import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static final int N = 12;
    public static void main(String[] args) {
        int l;
        double m[][] = new double[N][N];
        char c;
        l = scan.nextInt();
        c = scan.next().charAt(0);
        lerMatriz(m, N);
        System.out.printf("%.1f\n", linha(l, c, m[l], N));
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
    public static double linha (int l, char c, double m[], int n) {
        int j = 0;
        double soma = 0;
        while (j < n){
            soma = soma + m[j];
            j++;
        }
        if (c == 'M') {
            soma = soma / n;
        } 
        return soma;
    }
}