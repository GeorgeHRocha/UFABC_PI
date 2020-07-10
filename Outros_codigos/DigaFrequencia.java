import java.util.Scanner;
public class DigaFrequencia {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        char vet1[] = new char [n.length()];
        int vet2 [] = new int [n.length()];
        int i = 0, j = 0, k = 0;
        vet1[i] = n.charAt(i);
        vet2[i] = 1;
        k = k + 1;
        i = i + 1;
        while (i < n.length()) {
            while (j < i && vet1[j] != n.charAt(i)) {
                j = j + 1;
            }
            if (j < i) {
                vet2[j] = vet2[j] + 1;
            } else {
                vet1[k] = n.charAt(i);
                vet2[k] = 1;
                k = k + 1;
            }
            j = 0;
            i = i + 1;
        }
        i = 0;
        while (i < k) {
            System.out.println(vet1[i] + " - " + vet2[i]);
            i = i + 1;
        }
    }
}