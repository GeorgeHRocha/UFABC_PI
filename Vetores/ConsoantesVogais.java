import java.util.Scanner;
public class ConsoantesVogais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String[] alf = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String c;
        c = scan.next();
        while ((i < 26) && !c.equalsIgnoreCase(alf[i])) {
            i = i + 1;
        }
        if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
            System.out.println("vogal");
        } else if (i < 26) {
            System.out.println("consoante");
        }
    }
}