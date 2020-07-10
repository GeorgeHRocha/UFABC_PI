import java.util.Scanner;
public class Ordem {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0;
        n = scan.nextInt();
        int [] vet = new int[n];
        while (i < n) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i + 1 < n && vet[i] >= vet[i + 1]) {
            i = i + 1;
        }
        if (i + 1 == n) {
            System.out.println("SIM");
        } else {
            i = 0;
            while (i + 1 < n && vet[i] <= vet[i + 1]) {
                i = i + 1;
            }
            if (i + 1 == n) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }
    }
}