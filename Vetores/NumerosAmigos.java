import java.util.Scanner;
public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a1, a2, r1 = 0, r2 = 0, i = 1, j = 0;
        while(scan.hasNext()) {
            a1 = scan.nextInt();
            a2 = scan.nextInt();
            while (i < a1) {
                if (a1 % i == 0) {
                        r1 = r1 + i;
                    }
                i = i + 1;
            }
            i = 1;
            while (i < a2) {
                if (a2 % i == 0) {
                        r2 = r2 + i;
                    }
                i = i + 1;
            }
            if (a1 == r2 && a2 == r1) {
                System.out.println("amigos");
            } else {
                System.out.println("nao amigos");
            }
            r1 = 0;
            r2 = 0;
            i = 1;
        }
    }
}