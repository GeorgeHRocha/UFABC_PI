import java.util.Scanner;
public class MatrizXadrez {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int l, c, i = 0, j = 0, e;
        l = scan.nextInt();
        c = scan.nextInt();
        while (i < l) {
            while (j < c) {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    e = 0;
                } else {
                    e = 1;
                }
                System.out.print(e + (j + 1 < c ? " ":"\n"));
                j++;
            }
            i++;
            j = 0;
        }
    }
}