import java.util.Scanner;
public class Placas {
    public static int convertePlaca(String placa) {
        int pl1_parte_alfa = (placa.charAt(0) * 26 * 26 + placa.charAt(1) * 26 + placa.charAt(2)); 
        int pl1_parte_num = Integer.parseInt(placa.substring(3, 7));
        return pl1_parte_alfa * 10 * 10 * 10 * 10 + pl1_parte_num;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String placa1, placa2;
        placa1 = scan.next();
        placa2 = scan.next();
        int dif = convertePlaca(placa2) - convertePlaca(placa1) - 1;
        System.out.println(dif);
    }
}