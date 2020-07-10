import java.util.Scanner;
public class Led {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, led = 0, j = 0;
        String numero = "";
        n = scan.nextInt();
        while (i < n) {
            numero = scan.next();
            while (j < numero.length()) {
                if (numero.charAt(j) == '1') {
                    led = led + 2;
                } else if (numero.charAt(j) == '2' || numero.charAt(j) == '3' || numero.charAt(j) == '5') {
                    led = led + 5;
                } else if (numero.charAt(j) == '4') {
                    led = led + 4;
                } else if (numero.charAt(j) == '6' || numero.charAt(j) == '9' || numero.charAt(j) == '0') {
                    led = led + 6;
                } else if (numero.charAt(j) == '7') {
                    led = led + 3;
                } else if (numero.charAt(j) == '8') {
                    led = led + 7;
                } 
                j = j + 1;
            }
            System.out.println(led + " leds");
            i = i + 1;
            j = 0;
            led = 0;
        }  
    }
}