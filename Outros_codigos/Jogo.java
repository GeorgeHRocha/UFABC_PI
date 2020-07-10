import java.util.Scanner;
public class Jogo {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int h, m, h2, m2;
        h = scan.nextInt();
        m = scan.nextInt();
        h2 = scan.nextInt();
        m2 = scan.nextInt();
        if (h2 >= h && m2 >= m) {
            System.out.println("DUROU " + (h2 - h) + " HORA(S) e " + (m2 - m) + " MINUTOS");
        } else if (h2 >= h && m2 < m) {
            System.out.println("DUROU " + (h2 - h - 1) + " HORA(S) e " + (60 - (m - m2)) + " MINUTOS");
        } else if (h2 < h && m2 >= m) {
            System.out.println("DUROU " + (24 - (h - h2)) + " HORA(S) e " + (m2 - m) + " MINUTOS");
        } else {
            System.out.println("DUROU " + (24 - (h - h2) - 1) + " HORA(S) e " + (60 - (m - m2)) + " MINUTOS");
        }
    }
}