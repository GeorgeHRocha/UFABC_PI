import java.util.Scanner;
public class OrdenaTamanho2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, f = 0;
        n = scan.nextInt();
        String [] vet = new String [n];
        String temp = "";
        while (i < n) {
            vet[i] = scan.next();
            i = i + 1;
        }
        i = 0;
        j = 1;
        while (i + 1 < n) {
            while (j < n) {
                if (vet[i].length() > vet[j].length()) {
                    temp = vet[i];
                    vet[i] = vet[j];
                    f = i + 1;
                    while (f <= j) {
                        vet[j] = vet[f];
                        vet[f] = temp;
                        temp = vet[j];
                        f = f + 1;
                    }
                }
                j = j + 1;
            }
            i = i + 1;
            j = i + 1;
        }
        i = 0;
        while (i < n) {
            System.out.println(vet[i]);
            i = i + 1;
        }
    }
}