import java.util.Scanner;
public class SwitchTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch (n) {
            case 0:
                System.out.println("nulo");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Não nulo");
                break;          
        }
    }
}