import java.util.Scanner;
public class Media {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0; 
        double n, soma = 0;
        while (scan.hasNext()) {
            n = scan.nextDouble();
            soma = soma + n;
            i++;
        }
        System.out.println(soma / i);
    }
}