import java.util.Scanner;
public class MDC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, primo = 2, i = 2, r = 1;
        a = scan.nextInt();
        b = scan.nextInt();
        while (a > 1 || b > 1) {
            if (a % primo == 0 && b % primo == 0) {
                a = a / primo;
                b = b / primo;
                r = r * primo;
            } else {
                if (a % primo == 0) {
                    a = a / primo;
                } else if (b % primo == 0) {
                    b = b / primo;
                } else {
                    primo = primo + 1;
                    while (i < primo) {
                        while (i < primo && primo % i != 0) {
                            i = i + 1;
                        }
                        if (i < primo) {
                            primo = primo + 1;
                            i = 2;
                        }
                    }
                }
            }
        }
        System.out.println(r);
    }
}