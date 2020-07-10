import java.util.Scanner;
public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1, a2;
        while(scan.hasNext()) {
            a1 = scan.nextInt();
            a2 = scan.nextInt();
            if (a1 == amigos(a2) && a2 == amigos(a1)) {
                System.out.println("amigos");
            } else {
                System.out.println("nao amigos");
            }
        }
    }
    public static int amigos (int a) {
        int i = 1, r = 0;
        while (i < a) {
            if (a % i == 0) {
                r = r + i;
            }
            i = i + 1;
        }
        return r;
    }
}