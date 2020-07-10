import java.util.Scanner;
public class Uri1182 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int c, i = 0, j = 0;
        double m [][] = new double [12][12];
        char ch;
        c = scan.nextInt();
        ch = scan.next().charAt(0);
        while(i < 12) {
            while (j < 12) {
                m[i][j] = scan.nextDouble();
                j++;
            }
            i++;
            j = 0;
        }
        System.out.printf("%.1f\n", coluna(c, ch, m));
    }
    public static double coluna(int c, char ch, double m[][]) {
        int i = 0;
        double soma = 0;
        while(i < 12) {
            soma = soma + m[i][c];
            i++;
        }
        if(ch == 'M') {
            soma = soma / 12;
        }
        return soma;
    }
}