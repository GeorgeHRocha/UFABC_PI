import java.util.Scanner;

public class EliminaRepete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v1 = new int[1000];
        int[] v2 = new int[1000];
        int[] v3 = new int[1000];
        int i = 0, j = 0, k = 0, n, l = 0;
        n = sc.nextInt();
        while (i < n) {
            v1[i] = sc.nextInt();
            i++;
        }
        i = 1;
        while (i < n) {
            while (j < i) {
                if (v1[i] == v1[j]) {
                    v2[k] = i;
                    k++;
                }
                j++;
            }
            i++;
            j = 0;
        }
        i = 0;
        j = 0;
        while (i < n) {
            while (j < k && i != v2[j]) {
                j++;

            }
            if (j == k) {
                v3[l] = v1[i];
                l++;
            }
            i++;
            j = 0;
        }
        i = 0;
        while (i < l) {
            if (i + 1 < l) {
                System.out.print(v3[i] + " ");
            } else {
                System.out.println(v3[i]);
            }
            i++;
        }
    }
}
