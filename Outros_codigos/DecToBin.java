import java.util.Scanner;
public class DecToBin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0;
        String r = "";
        n = scan.nextInt();
        while (n > 1) {
            r = r +  n % 2;
            n = n / 2;
        }
        r = r + n;
        while(i < r.length()) {
            System.out.print(r.charAt(r.length() - 1 - i) + (i + 1 < r.length() ? "" : "\n"));
            i++;
        }
    }
}