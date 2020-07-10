import java.util.Scanner;
public class ClassificaNumero {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int n;
        n = scan.nextInt();
        if (n % 2 != 0) {
            System.out.println(1);
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println(0);
            } else if (n >= 6 && n <= 20) {
                System.out.println(1);
            } else if (n > 20) {
                System.out.println(0);
            }
        }
    }
}