import java.util.Scanner;
public class Duendes {
    public static void main(String[] args) {
        int n, a, b;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        if (a + b <= n) {
            System.out.println("Farei hoje!");
        } else {
            System.out.println("Deixa para amanha!");
        }
    }
}