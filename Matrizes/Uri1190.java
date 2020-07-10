import java.util.Scanner;
public class Uri1190 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        double m[][] = new double[12][12];
		int	i = 0, j = 0;
        ch = scan.next().charAt(0);
        while (i < 12) {
            while (j < 12) {
                m[i][j] = scan.nextDouble();
                j++;
            }
            i++;
            j = 0;
        }
        System.out.printf("%.1f\n", calc (ch, m));
    }
    public static double calc(char ch, double m[][]) {
        int i = 1, j = 11, q = 0;
        double soma = 0;
        while (j > 6) {
            while (i < j) {
                soma = soma + m[i][j];
                i++;
                q++;
            }
            j--;
            i = 12 - j;
        }
        if (ch == 'M') {
            soma=  soma / q;
        }
        return soma;
    }
}