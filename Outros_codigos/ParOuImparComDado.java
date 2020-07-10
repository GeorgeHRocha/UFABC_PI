import java.util.Scanner;
public class ParOuImparComDado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, ptL = 0, ptS = 0, sSheldon, sLeonard, i = 0;
        n = scan.nextInt();
        sSheldon =scan.nextInt();
        if (n == 1 && sSheldon % 2 == 0) {
            System.out.println("Sheldon");
        } else {
            if (sSheldon % 2 == 0) {
                ptS = ptS + 1;
            }
            while (ptS < n && ptL < n) {
                if (i % 2 != 0) {
                    sSheldon =scan.nextInt();
                    if (sSheldon % 2 == 0 && ptS % 2 == 0) {
                        ptS = ptS + 1;
                    } else if (sSheldon % 2 != 0 && ptS % 2 != 0) {
                        ptS = ptS + 1;
                    } else {
                        if (ptS > 0) {
                            ptS = ptS - 1;
                        }
                    }
                } else {
                    sLeonard =scan.nextInt();
                    if (sLeonard % 2 == 0 && ptL % 2 == 0) {
                        ptL = ptL + 1;
                    } else if (sLeonard % 2 != 0 && ptL % 2 != 0) {
                        ptL = ptL + 1;
                    } else {
                        if (ptL > 0) {
                            ptL = ptL - 1;
                        }
                    }
                }
                i = i + 1;
            }
            if (ptS == n) {
                System.out.println("Sheldon");
            } else {
                System.out.println("Leonard");
            }
        }
    }
}