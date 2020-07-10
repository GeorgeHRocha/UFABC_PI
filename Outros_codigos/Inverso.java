import java.util.Scanner;
public class Inverso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra;
        int i = 0, j = 0;
        while(scan.hasNext()) {
            palavra = scan.next();
            while(i < palavra.length()) {
                System.out.print(palavra.charAt(palavra.length() - 1 - i));
                i = i + 1;
            }
            System.out.println();
            i = 0;
        }
    }
}