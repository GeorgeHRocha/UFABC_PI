import java.util.Scanner;
public class ElementosUnicos {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String vet [] = new String[1000000];
        int i = 0, n;
        String acum = ";";
        n = scan.nextInt();
        while(i < n) {
            vet[i] = scan.next();
            i++;
        }
        i = 0;
        System.out.println(vet[i]);
        acum = acum + vet[i] + ";";
        i++;
        while(i < n) {
            if(!acum.contains(";" + vet[i] + ";")) {
                System.out.println(vet[i]);
                acum = acum + vet[i] + ";";
            }
            i++;
        }
    }
}