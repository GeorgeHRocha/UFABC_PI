import java.util.Scanner;
public class Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String senha;
        senha = scan.next();
        while (i < 4 && senha.charAt(i) != '0') {
            i = i + 1;
        }
        if(i < 4) {
            System.out.println("NAO");
        } else {
            System.out.println("SIM");
        }
    }
}