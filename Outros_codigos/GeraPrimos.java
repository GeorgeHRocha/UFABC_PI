import java.util.Scanner;
public class GeraPrimos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 2, j = 2;
        while (i > 0) {
            while (j < i && i % j != 0) {
                j++;
            }
            if (i == j) {
                System.out.print(i + " ");
            }
            i++;
            j = 2;
        }
    }
}