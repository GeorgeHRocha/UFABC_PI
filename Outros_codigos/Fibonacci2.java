import java.util.Scanner;
public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, r = 0, t = 0, s;
        n = scan.nextInt();
        while(i < n) {
            if (r == 0) {
                System.out.print(r + (i + 1 < n ? " " : "\n"));
                r = r + 1;
                System.out.print(r + (i + 1 < n ? " " : "\n"));
            } else {
                s = r;
                r = r + t;
                t = s;
                System.out.print(r + (i + 1 < n ? " " : "\n"));
            }
            i = i + 1;
        }
    }
}