import java.util.Scanner;
public class Uri1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l, i = 0, j = 0;
        double m[][] = new double[12][12];
        char c;
        l = scan.nextInt();
        c = scan.next().charAt(0);
        while (i < 12) {
            while(j < 12) {
                m[i][j] = scan.nextDouble();
                j++;
            }
            i++;
            j = 0;
        }
        System.out.printf("%.1f\n", linha(l, c, m[l]));
    }
    public static double linha (int l, char c,double m[]) {
        int j = 0;
        double soma = 0;
        while (j < 12){
            soma = soma + m[j];
            j++;
        }
        if (c == 'M') {
            soma = soma / 12;
        } 
        return soma;
    }
}