import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 1, r = 0, t = 0, s;
        n = scan.nextInt();
        while(i < n) {
            if (r == 0) {
                r = r + 1;
            } else {
                s = r;
                r = r + t;
                t = s;
            }
            i = i + 1;
        }
        System.out.println(r);
    }
}