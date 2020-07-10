import java.util.Scanner;
public class Maiusculo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n;
        int i = 0;
        n = scan.nextLine();
        while (i < n.length()) {
            System.out.print(Character.toUpperCase(n.charAt(i)) + (i + 1 < n.length() ? "" : "\n"));
            i++;
        }
    }
}