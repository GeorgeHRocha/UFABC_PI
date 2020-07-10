import java.util.Scanner;
public class Regioes {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r = 0;
        n = scan.nextInt();
        r = n + 1;
        while (n > 0) {
            r = r + n - 1;
            n = n - 1;
        }
        System.out.println(r);
    }
}