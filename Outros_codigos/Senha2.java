import java.util.Scanner;
public class Senha2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha;
        senha = scan.next();
        if (senha.charAt(0) == senha.charAt(1) || senha.charAt(0) == senha.charAt(2) || senha.charAt(0) == senha.charAt(3)) {
            System.out.println("NAO");
        } else if (senha.charAt(1) == senha.charAt(2) || senha.charAt(1) == senha.charAt(3)) {
            System.out.println("NAO");
        } else if (senha.charAt(2) == senha.charAt(3)) {
            System.out.println("NAO");
        } else {
            System.out.println("SIM");
        }
    }
}