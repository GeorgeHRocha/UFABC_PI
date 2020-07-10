import java.util.Scanner;
public class TicTacToy {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, k = 0;
        char mat[][] = new char [3][3];
        n = scan.nextInt();
        while (k < n) {
            while (i < 3) {
                while (j < 3) {
                    mat[i][j] = scan.next().charAt(0);
                    j++;
                }
                i++;
                j = 0;
            }
            if (mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2]) {
                System.out.println("o jogador " + mat[0][0] + " venceu");
            } else if (mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2]) {
                System.out.println("o jogador " + mat[1][0] + " venceu");
            } else if (mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2]) {
                System.out.println("o jogador " + mat[2][0] + " venceu");
            } else if (mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0]) {
                System.out.println("o jogador " + mat[0][0] + " venceu");
            } else if (mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1]) {
                System.out.println("o jogador " + mat[0][1] + " venceu");
            } else if (mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2]) {
                System.out.println("o jogador " + mat[0][2] + " venceu");
            } else if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) {
                System.out.println("o jogador " + mat[0][0] + " venceu");
            } else if (mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0]) {
                System.out.println("o jogador " + mat[0][2] + " venceu");
            } else {
                System.out.println("o jogo deu velha");
            }
            i = j = 0;
            k++;
        }
    }
}