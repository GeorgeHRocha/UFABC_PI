import java.util.Scanner;
public class IdadeSegundos {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        idade = scan.nextInt();
        System.out.println(3600 * 24 * 365 * idade);
    }
}