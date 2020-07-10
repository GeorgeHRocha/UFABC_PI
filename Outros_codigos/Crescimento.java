import java.util.Scanner;
public class Crescimento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t, i = 0;
        t = scan.nextInt();
        double[][] mat = new double[t][4];
        int [] vet = new int[t];
        while (i < t) {
            mat[i][0] = scan.nextInt();
            mat[i][1] = scan.nextInt();
            mat[i][2] = scan.nextDouble();
            mat[i][3] = scan.nextDouble();
            vet[i] = 0;
            i = i + 1;
        }
        i = 0;
        while (i < t) {
            while (mat[i][0] <= mat[i][1]) {
                mat[i][0] = mat[i][0] + (mat[i][0] * (mat[i][2]) / 100);
                mat[i][1] = mat[i][1] + (mat[i][1] * (mat[i][3]) / 100);
                vet[i] = vet[i] + 1;
            }
            i = i + 1;
        }
        i = 0;
        while (i < t) {
            if (vet[i] > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(vet[i] + " anos.");
            }
            i = i + 1;
        }
    }
}