import java.util.Scanner;
public class ConvTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s, h, m;
        s = scan.nextInt();
        h = s / 3600;
        m = (s % 3600) / 60;
        s = (s % 3600) % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}