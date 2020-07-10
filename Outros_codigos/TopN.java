import java.util.Scanner;
public class TopN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k, n = 0;
        k = scan.nextInt();
        if (k == 1) {
            n = 1;
        } else if (k <= 3) {
            n = 3;
        } else if (k <= 5) {
            n = 5;
        } else if (k <= 10) {
            n = 10;
        } else if (k <= 25) {
            n = 25;
        } else if (k <= 50) {
            n = 50;
        } else {
            n = 100;
        }
        System.out.println("Top " + n);
    } 
}