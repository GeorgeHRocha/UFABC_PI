import java.util.Scanner;
public class Figurinha {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, i = 0, j = 0, contadorA = 0, contadorB = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        int [] va = new int[a];
        int [] vb = new int[b];
        while (i < a) {
            va[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i < b) {
            vb[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while(i < a) {
            if(i == 0 || (i > 0 && va[i - 1] != va[i])) {
                while (j < b && vb[j] < va[i]) {
                    j = j + 1;
                }
                if(j == b || (j < b && vb[j] > va[i])) {
                    contadorA = contadorA + 1;
                }
            }
            j = 0;
            i = i + 1;
        }
        i = 0;
        j = 0;
        while(i < b) {
            if(i == 0 || (i > 0 && vb[i - 1] != vb[i])) {
                while (j < a && va[j] < vb[i]) {
                    j = j + 1;
                }
                if(j == a || (j < a && va[j] > vb[i])) {
                    contadorB = contadorB + 1;
                }
            }
            j = 0;
            i = i + 1;
        }
        if (contadorA < contadorB) {
            System.out.println(contadorA);
        } else {
            System.out.println(contadorB);
        }
    }
}