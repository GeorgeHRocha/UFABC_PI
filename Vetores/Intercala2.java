import java.util.Scanner;

public class Intercala2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] v = new int[1000000];
        int[] v1 = new int[500000];
        int[] v2 = new int[500000];
        int[] vr = new int[1000000];
        int q1, q2, i = 0, j = 0, k = 0;
        q1 = scan.nextInt();
        q2 = scan.nextInt();
        while (i < q1 + q2) {
            v[i] = scan.nextInt();
            i = i + 1;
        }
        i = 0;
        while (i < q1) {
            v1[i] = v[i];
            i = i + 1;
        }
        while (i <q1+ q2) {
            v2[j] = v[i];
            i = i + 1;
            j = j + 1;
        }
        i = 0;
        j = 0;
        while (k < q1 + q2 && i < q1 && j < q2) {
            if (v1[i] < v2[j]) {
                vr[k] = v1[i];
                i = i + 1;
            } else {
                vr[k] = v2[j];
                j = j + 1;
            }
            k = k + 1;
        }
        if (i == q1) {
            while (k < q1 + q2 && j < q2) {
                vr[k] = v2[j];
                k = k + 1;
                j = j + 1;
            }
        } else if (j == q2) {
            while (k < q1 + q2 && i < q1) {
                vr[k] = v1[i];
                k = k + 1;
                i = i + 1;
            }
        }
        i = 0;
        while (i < q1 + q2) {
            System.out.println(vr[i]);
            i = i + 1;
        }
    }
}
