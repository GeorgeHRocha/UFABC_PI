import java.util.Scanner;
public class Brazuca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, a, l, p;
        n = scan.nextInt();
        a = scan.nextInt();
        l = scan.nextInt();
        p = scan.nextInt();
        if (n <= a && n <= l && n <= p) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}