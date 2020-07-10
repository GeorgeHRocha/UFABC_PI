import java.util.Scanner;
public class EliminaVogais {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String n, ns = "";
        int i = 0, numVogais = 0, j = 0;
        while(scan.hasNext()) {
            n = scan.next();
            while (i < n.length()) {
                if (n.charAt(i) == 'a' || n.charAt(i) == 'A' || n.charAt(i) == 'e' || n.charAt(i) == 'E' || n.charAt(i) == 'i' || n.charAt(i) == 'I' || n.charAt(i) == 'o' || n.charAt(i) == 'O' || n.charAt(i) == 'u' || n.charAt(i) == 'U') {
                    numVogais = numVogais + 1;
                } else {
                    ns = ns + n.charAt(i);
                }
                i = i + 1;
            }
            System.out.println(numVogais + " " + ns);
            i = 0;
            numVogais = 0;
            ns = "";
        }
    }
}