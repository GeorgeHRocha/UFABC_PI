import java.util.Scanner;
public class FrequenciaNaAula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, i = 0, j = 0, cont = 0;
        n = scan.nextInt();
        int vet[] = new int [n];
        while (i < n) {
            vet[i] = scan.nextInt();
            i++;
        }
        i = 1;
        while (i < n) {
            while (j < i) {
                if(vet[i] == vet[j]) {
                    cont++;
                }
                j++;
            }
            i++;
            j = 0;
        }
        System.out.println(n - cont);
    }
}