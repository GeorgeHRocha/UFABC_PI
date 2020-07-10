import java.util.Scanner;

public class ElementosPares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, pares = 0;
        int vet[] = new int[1000];
        String acum = "";
        n = scan.nextInt();
        while (i < n) {
            vet[i] = scan.nextInt();
            if (vet[i] % 2 == 0) {
                acum = acum + vet[i] + " ";
                pares = pares + 1;
            }
            i = i + 1;
        }
        System.out.println(acum + pares);
    }
}
