import java.util.Scanner;
public class Lua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m1, m2;
        m1 = scan.nextInt();
        m2 = scan.nextInt();
        if (m2 <= 2) {
            System.out.println("Nova");
        } else if (m2 >= 97) {
            System.out.println("Cheia");
        } else {
            if (m1 < m2) {
                System.out.println("Crescente");
            } else if (m1 > m2) {
                System.out.println("Minguante");
            }
        }
    }
}