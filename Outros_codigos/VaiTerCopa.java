import java.util.Scanner;
public class VaiTerCopa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;     
        while (scan.hasNext()) {
            numero = scan.nextInt();   
            if (numero == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }
    }
}