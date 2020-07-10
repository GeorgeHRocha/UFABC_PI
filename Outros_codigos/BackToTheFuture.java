import java.util.Scanner;
public class BackToTheFuture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String setas;
        int n, i = 0, d, m, a, k, j = 0;
        int[] b = new int[]{1, -1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        int[] nb = new int[]{1, -2, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        n = scan.nextInt();
        String[] vet = new String[n];
        while (i < n) {
            d = scan.nextInt();
            m = scan.nextInt();
            a = scan.nextInt();
            k = scan.nextInt();
            setas = scan.next();
            while (j < k) {
                if (setas.charAt(j) == '>') {
                    if ((a % 400) == 0 || ((a % 4) == 0 && (a % 100) != 0)) {
                        if (d == (30 + b[m - 1])) {
                            if (m == 12) {
                                d = 1;
                                m = 1;
                                a = a + 1;
                            } else if (m < 12) {
                                d = 1;
                                m = m + 1;
                            }
                        } else if (d < (30 + b[m - 1])) {
                            d = d + 1;
                        }
                    } else {
                        if (d == (30 + nb[m - 1])) {
                            if (m == 12) {
                                d = 1;
                                m = 1;
                                a = a + 1;
                            } else if (m < 12) {
                                d = 1;
                                m = m + 1;
                            }
                        } else if (d < (30 + b[m - 1])) {
                            d = d + 1;
                        }
                    }
                } else if (setas.charAt(j) == '<') {
                    if ((a % 400) == 0 || ((a % 4) == 0 && (a % 100) != 0)) {
                        if (d == 1) {
                            if (m == 1) {
                                d = 31;
                                m = 12;
                                a = a - 1;
                            } else if (m > 1) {
                                d = 30 + b[m - 2];
                                m = m - 1;
                            }
                        } else if (d > 1) {
                            d = d - 1;
                        }
                    } else {
                        if (d == 1) {
                            if (m == 1) {
                                d = 31;
                                m = 12;
                                a = a - 1;
                            } else if (m > 1) {
                                d = 30 + nb[m - 2];
                                m = m - 1;
                            }
                        } else if (d > 1) {
                            d = d - 1;
                        }
                    } 
                }
                j = j + 1;
            }
            j = 0;
            vet[i] = d + "/" + m + "/" + a;
            i = i + 1;
        }
        i = 0;
        while (i < n) {
            System.out.println(vet[i]);
            i = i + 1;
        }
    }
}