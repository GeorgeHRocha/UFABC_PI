import java.util.Scanner;
public class RomaToIndu {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String roma, alg ="IVXLCDM", acum = "" ;
        int vet [] = new int[] {1, 5, 10, 50, 100, 500, 1000};
        int r = 0, i = 0;
        while(scan.hasNext()) {
            roma = scan.next();
            if (roma.length() == 1) {
                System.out.println(vet[alg.indexOf(roma.charAt(0))]);
            } else {
                while (i + 1 < roma.length()) {
                    if(vet[alg.indexOf(roma.charAt(i))] < vet[alg.indexOf(roma.charAt(i + 1))]) {
                        r = r - vet[alg.indexOf(roma.charAt(i))];
                    } else {
                        r = r + vet[alg.indexOf(roma.charAt(i))];
                    }
                    i = i + 1;
                }
                r = r + vet[alg.indexOf(roma.charAt(i))];
                System.out.println(r);
            }
            r = 0;
            i = 0;
        }
    }
}