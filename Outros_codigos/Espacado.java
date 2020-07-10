import java.util.Scanner;
public class Espacado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra;
        int i = 0;
        while (scan.hasNext()) {
            palavra = scan.next();
            while (i < palavra.length()) {
                if (i < palavra.length() - 1) {
                    System.out.print(palavra.charAt(i) + " ");
                } else {
                    System.out.println(palavra.charAt(i));
                }
                i = i + 1;
            }
            i = 0;
        }
    }
}