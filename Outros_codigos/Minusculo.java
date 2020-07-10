import java.util.Scanner;
public class Minusculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n;
        int i = 0;
        n = scan.nextLine();
        while (i < n.length()) {
            System.out.print(Character.toLowerCase(n.charAt(i)) + (i + 1 < n.length() ? "" : "\n"));
            i++;
        }
    }
}