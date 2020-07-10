import java.util.Scanner;
public class MaiorPalavra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra, maiorPalavra = "";
        int i = 0;
        while (scan.hasNext()) {
            palavra = scan.next();
            if (i == 0) {
                maiorPalavra = palavra;
            } else {
                if (palavra.length() > maiorPalavra.length()) {
                    maiorPalavra = palavra;
                }
            }
            i = i + 1;
        }
        if (i == 0) {
            System.out.println("Nenhuma palavra foi informada");
        } else {
            System.out.println("A maior palavra informada foi " + maiorPalavra);
        }
    }
}