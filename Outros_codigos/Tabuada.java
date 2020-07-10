import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 2, j = 1;
        while (j < 11) {
            while (i < 11) {
                System.out.print(i + "x" + j + "=" + i * j + (i + 1 < 11 ? " " : "\n"));
                i++;
            }
            j++;
            i = 2;
        }
    }
}