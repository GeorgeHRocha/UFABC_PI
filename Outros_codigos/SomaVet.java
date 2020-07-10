import java.util.Scanner;

public class SomaVet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n, i = 0, soma = 0, v;
        n = scan.nextLong();
        while (i < n) {
            v = scan.nextLong();
            soma = soma + v;
            i = i + 1;
        }
        System.out.println(soma);
    }
}
