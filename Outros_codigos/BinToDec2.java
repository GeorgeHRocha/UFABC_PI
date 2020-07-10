import java.util.Scanner;
public class BinToDec2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n, i = 0, a, k = 1, r = 0;
        String nb;
        n = scan.nextInt();
        int [] vet = new int [n];
        while (i < n) {
            nb = scan.next();
            a = nb.length() - 1;
            while (a >= 0) {
                if (nb.charAt(a) == '1') {
                    r = r + k;
                }
                k = k * 2;
                a = a - 1;
            }
            vet[i] = r;
            i = i + 1;
            k = 1;
            r = 0;
        } 
        i = 0;
        while (i < n) {
            System.out.println(vet[i]);
            i = i + 1;
        }
    }
}