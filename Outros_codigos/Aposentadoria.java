import java.util.Scanner;
public class Aposentadoria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sexo, idade, tempContribuicao;
        sexo = scan.nextInt();
        idade = scan.nextInt();
        tempContribuicao = scan.nextInt();
        if (sexo == 0 && idade >= 65 && tempContribuicao >= 10) {
            System.out.println("Aposentavel");
        } else if (sexo == 0 && idade >= 63 && tempContribuicao >= 15) {
            System.out.println("Aposentavel");
        } else if (sexo == 1 && idade >= 63 && tempContribuicao >= 10) {
            System.out.println("Aposentavel");
        } else if (sexo == 1 && idade >= 61 && tempContribuicao >= 15) {
            System.out.println("Aposentavel");
        } else {
            System.out.println("Nao Aposentavel");
        }
    }
}