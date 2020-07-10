import java.util.Scanner;
public class Huaauhahhuahau {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String n, ed = "", de = "";
        int i = 0;
        n = scan.next();
        while (i <n.length()) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                ed = ed + n.charAt(i);
            }
            i = i + 1;
        }
        i = i - 1;
        while (i >= 0) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                de = de + n.charAt(i);
            }
            i = i - 1;
        }
        if (ed.equals(de)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}