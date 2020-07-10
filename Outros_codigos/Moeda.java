import java.util.Scanner;
public class Moeda {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        double aleatorio;
        aleatorio = Math.random();
        i = scan.nextInt();
        if (i == 1 && aleatorio >= 0.5) {
            System.out.println("ganhou");
        } else if (i == 1 && aleatorio < 0.5) {
            System.out.println("perdeu");
        } else if (i == 0 && aleatorio < 0.5) {
            System.out.println("ganhou");
        } else if (i == 0 && aleatorio >= 0.5) {
            System.out.println("perdeu");
        }
    }
}