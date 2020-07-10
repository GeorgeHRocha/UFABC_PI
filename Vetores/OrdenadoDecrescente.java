import java.util.Scanner;
public class OrdenadoDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0;
        int[] vet = new int[10000];
        while (scan.hasNext()) {
            n = scan.nextInt();
            while (i < n) {
                vet[i] = scan.nextInt();
                i = i + 1;
            }
            i = 0;
            while (i + 1 < n && vet[i] >= vet[i + 1]) {
                i = i + 1;
            }
            if (i + 1 == n || n == 0) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
            i = 0;
        }
    }
}
