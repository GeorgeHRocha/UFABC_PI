import java.util.Scanner;

public class PrimeiroMenor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[6];
        int i = 0, menor = 0;
        while (i < 6) {
            vet[i] = scan.nextInt();
            i = i + 1;
        }
        menor = vet[0];
        i = 1;
        while (i < 6) {
            if (vet[i] < menor) {
                menor = vet[i];               
            }
            i = i + 1;
        }
        System.out.println(menor);
    }
}
