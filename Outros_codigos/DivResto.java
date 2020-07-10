import java.util.Scanner;
public class DivResto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, div, rest;
        a = scan.nextInt();
        b = scan.nextInt();
        div = a / b;
        rest = a % b;
        System.out.println(div + " "+ rest);
    }
}