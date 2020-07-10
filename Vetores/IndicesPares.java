import java.util.Scanner;
public class IndicesPares {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int vet[] = new int[1000];
        int i = 0, par = 0, n;
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i < n) {
            if (vet[i] % 2 == 0) {
                par = par + 1;
            }
            i = i + 1;
        }
        i = 0;
        while (i < n) {
            System.out.print(vet[i] + " ");
            i = i + 2;
        }
        System.out.println(par);
    }
}