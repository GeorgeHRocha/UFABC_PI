import java.util.Scanner;
public class Uri1188 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        ch = scan.next().charAt(0);
        double m[][] = new double[12][12];
		int i = 0, j = 0;
        while (i < 12) {
            while (j < 12) {
                m[i][j] = scan.nextDouble();
                j++;
            }
            i++;
            j = 0;
        }
        System.out.printf("%.1f\n", calc(ch, m));
    }
    public static double calc (char ch, double m[][]) {
        int i = 7, j = 5, q = 0;
        double soma = 0;
        while (i < 12) {
            while (j < i) {
                soma = soma + m[i][j];
                j++;
                q++;
            }
            j = 12 - i - 1;
            i++;
        }
        if (ch == 'M') {
            soma = soma / q;
        }
        return soma;
    }
}