import java.util.Scanner;

public class InverteMaxMin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[1000];
        int n, iMaior = 0, iMenor = 0, aux, i = 0;
        n = sc.nextInt();
        while (i < n) {
            v1[i] = sc.nextInt();
            i++;
        }
        i = 1;
        while (i < n) {
            if (v1[iMaior] < v1[i]) {
                iMaior = i;
            }
            if (v1[iMenor] > v1[i]) {
                iMenor = i;
            }
            i++;
        }
        aux = v1[iMaior];
        v1[iMaior] = v1[iMenor];
        v1[iMenor] = aux;
        i = 0;
        while (i < n) {
            if (i + 1 < n) {
                System.out.print(v1[i] + " ");
            } else {
                System.out.println(v1[i]);
            }
            i++;
        }
    }
}
