import java.util.Scanner;
public class Perfeito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 1, r = 0;
        n = scan.nextInt();
        while (i < n) {
            if (n % i == 0) {
                r = r + i;
            }
            i = i + 1;
        }
        if (r == n) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}