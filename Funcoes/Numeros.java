import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        String acumulador = "";
        n = scan.nextInt();
        if (numero(n) > n) {
            System.out.println("abundante");
        } else if (numero(n) == n) {
            System.out.println("perfeito");
        } else {
            System.out.println("deficiente");
        }
        
    }
    public static int numero (int n) {
        int i = 1, r = 0;
        while (i < n) {
            if (n % i == 0) {
                r = r + i;
            }
            i = i + 1;
        }
        return r;
    }
}