import java.util.Scanner;

public class SomaElementos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, soma = 0, v;
        n = scan.nextInt();
        while (i < n) {
            v = scan.nextInt();
            soma = soma + v;
            i = i + 1;
        }
        System.out.println(soma);
    }
}
