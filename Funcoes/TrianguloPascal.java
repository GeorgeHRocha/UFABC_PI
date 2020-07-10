import java.util.Scanner;
public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, p = 0, num;
        num = scan.nextInt();
        while(n < num) {
            while (p <= n) {
                System.out.print(fatorial(n) / (fatorial(p) * fatorial(n - p)) + (p + 1 <= n ? " " : "\n"));
                //*System.out.print("(" + n + " " + p + ")" + (p + 1 <= n ? " " : "\n"));
                p++;
            }
            n++;
            p = 0;
        }
    }
    public static long fatorial (int n) {
        long r = 1;
        while (n > 1) {
            r = r * n;
            n--;
        }
        return r;
    }
}