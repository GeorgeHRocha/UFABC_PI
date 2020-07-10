import java.util.Scanner;
public class Cedulas2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r, i = 0;
        r = scan.nextInt();
        int[] vet = new int[]{(r / 100), ((r % 100) / 50), (((r % 100) % 50) / 20), ((((r % 100) % 50) % 20) / 10), (((((r % 100) % 50) % 20) % 10) / 5), ((((((r % 100) % 50) % 20) % 10) % 5) / 2), ((((((r % 100) % 50) % 20) % 10) % 5) % 2)};
        int[] vet2 = new int[]{100, 50, 20, 10, 5, 2, 1};
        System.out.println("R$" + r + ".00");
        while (i < 7) {
            if (vet[i] != 0) {
                System.out.println(vet[i] + " nota(s) de R$" + vet2[i] + ".00");
            }
            i = i + 1;
        }
    }
}