import java.util.Scanner;
public class MaisMenos {
    public static void main(String[] args) {
        int a, menos, mais;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        menos = a - 1;
        mais = a + 1;
        System.out.println(menos + " " + mais);
    }
}