import java.util.Scanner;
public class DesvioPadrao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0;
        n = scan.nextInt();
        double vet[] = new double[n];
        while(i < n) {
            vet[i] = scan.nextDouble();
            i++;
        }
        System.out.println(media(n, vet));
        System.out.println(desvPadrao(n, vet, media(n, vet)));
    }
    public static double desvPadrao (int n, double vet[], double media) {
        int i = 0;
        double soma = 0, desv = 0;
        while(i < n) {
            soma = soma + Math.pow(vet[i] - media, 2);
            i++;
        }
        desv = Math.sqrt(soma / (n * (n - 1)));
        return desv;
    }
     public static double media (int n, double vet[]) {
        int i = 0;
        double md = 0;
        while(i < n) {
            md = md + vet[i];
            i++;
        }
        md = md / n;
        return md;
    }
}