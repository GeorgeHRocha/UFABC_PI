import java.util.Scanner;
public class Jokenpo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int c, i = 0;
        String jogador1, jogador2;
        c = scan.nextInt();
        String [] vet = new String [c];
        while (i < c) {
            jogador1 = scan.next();
            jogador2 = scan.next();
            if (jogador1.equals(jogador2)) {
                vet[i] = "empate";
            } else {
                if ((jogador1.equals("pedra") && jogador2.equals("tesoura")) || (jogador1.equals("tesoura") && jogador2.equals("papel")) || (jogador1.equals("papel") && jogador2.equals("pedra"))) {
                    vet[i] = "jogador 1";
                } else {
                    vet[i] = "jogador 2";
                }
            }
            i = i + 1;
        }
        i= 0;
        while (i < c) {
            System.out.println(vet[i]);
            i = i + 1;
        }
    }
}