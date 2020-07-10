import java.util.Scanner;
public class Pim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 1, k = 0;
        n = scan.nextInt();
        while (k < n) {
            while (i % 4 != 0) {
                System.out.print(i + " ");
                i = i + 1;
            }
            i = i + 1;
            System.out.println("PIM");
            k = k + 1;
        }
    }
}