import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r = 0, i = 1, j = 0;
        n = scan.nextInt();
        while(n >= 0) {
            while (i < n) {
                if (n % i == 0) {
                    r = r + i;
                }
                i = i + 1;
            }
            if (r > n) {
                System.out.println("abundante");
            } else if (r == n) {
                System.out.println("perfeito");
            } else {
                System.out.println("deficiente");
            }
            r = 0;
            i = 1;
            n = scan.nextInt();
        }
    }
}