import java.util.Scanner;
public class Coordenadas {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2;
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        if (n1 == 0 && n2 == 0) {
            System.out.println("Origem");
        } else if (n1 == 0) {
            System.out.println("Eixo Y");
        } else if (n2 == 0) {
            System.out.println("Eixo X");
        } else if (n1 > 0 && n2 > 0) {
            System.out.println("Q1");
        } else if (n1 < 0 && n2 > 0) {
            System.out.println("Q2");
        } else if (n1 > 0 && n2 < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Q3");
        }
    }
}