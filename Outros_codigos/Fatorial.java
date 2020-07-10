import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n, i = 1;
        n = scan.nextLong();
        while (n > 1) {
           i = i * n;
           n = n - 1;
        }
        System.out.println(i);
    }
}