import java.util.Scanner;

public class IntercalaStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alf = "abcdefghijklmnopqrstuvwxyz", v1, v2, vr = "";
        int s1, s2, i = 0, j = 0;
        s1 = scan.nextInt();
        v1 = scan.next();
        s2 = scan.nextInt();
        v2 = scan.next();
        while (i < s1 && j < s2) {
            if (alf.indexOf(v1.charAt(i)) < alf.indexOf(v2.charAt(j))) {
                vr = vr + v1.charAt(i);
                i = i + 1;
            } else {
                vr = vr + v2.charAt(j);
                j = j + 1;
            }
        }
        if(i == s1) {
            while (j < s2) {
                vr = vr + v2.charAt(j);
                j = j + 1;
            }
        } else if (j == s2) {
            while (i < s1) {
                vr = vr + v1.charAt(i);
                i = i + 1;
            }
        }
        System.out.println(vr);
    }
}
