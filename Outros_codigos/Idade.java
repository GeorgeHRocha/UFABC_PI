import java.util.Scanner;
public class Idade {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoAtual, anoNasc;
        String nome;
        anoAtual = scan.nextInt();
        nome = scan.next();
        anoNasc= scan.nextInt();
        System.out.println(nome + ", voce completa " + (anoAtual - anoNasc) + " anos de idade neste ano.");
    }
}