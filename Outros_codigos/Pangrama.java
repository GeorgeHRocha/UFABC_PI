import java.util.Scanner;
public class Pangrama {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alf = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] alf2 = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String n;
        int i = 0;
        while (scan.hasNext()) {
            n = scan.next();
            while (!n.contains(".")) {
                n = n + " " + scan.next();
            }
            while (i < 26 && (n.contains(alf[i]) || n.contains(alf2[i]))) {
                i = i + 1;
            }
            if (i == 26) {
                System.out.println("sim");
            } else {
                System.out.println("nao");
            }
            i = 0;
        }
    }
}