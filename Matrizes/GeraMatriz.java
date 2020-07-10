import java.util.Scanner;
public class GeraMatriz {
    /*private static final int QTD_ALUNOS = 3;*/
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int l, c, i = 0, j = 0;
        l = scan.nextInt();
        c = scan.nextInt();
        while (i < l) {
            while (j < c) {
                System.out.print(i + j + 1 + (j + 1 < c ? " " : "\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
}