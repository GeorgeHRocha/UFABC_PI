import java.util.Scanner;
public class Cha {
    public static void main(String[] args) {
        int t, qtPontos = 0, a, b, c, d, e;
        Scanner scan = new Scanner(System.in);
        t = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        e = scan.nextInt();
        if (t == a) {
            qtPontos = qtPontos = 1;
        }
        if (t == b) {
            qtPontos = qtPontos + 1;
        }
        if (t == c) {
            qtPontos = qtPontos + 1;
        }
        if (t == d) {
            qtPontos = qtPontos + 1;
        }
        if (t == e) {
            qtPontos = qtPontos + 1;
        }
        System.out.println(qtPontos);
    }
}