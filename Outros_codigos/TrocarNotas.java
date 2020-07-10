import java.util.Scanner;
public class TrocarNotas {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int r;
        r = scan.nextInt();
        System.out.println(((((r % 50) % 10) % 5) / 1) + " " + (((r % 50) % 10) / 5) + " " + ((r % 50) / 10) + " " + (r / 50));
    }
}