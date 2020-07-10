import java.util.Scanner;
public class Ante7 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args) {
        int n;
        n = scan.nextInt();
        int vet[] = new int [n];
        lerVetor(vet, n);
        System.out.println(antecessor(n, vet));
    }
	public static void lerVetor(int vet[], int n) {
		int i = 0;
		while(i < n) {
            vet[i] = scan.nextInt();
            i++;
        }
	}
    public static int antecessor (int n, int vet[]) {
        int i = 0, mult = 1;
        while (i < n) {
            while (i < n && vet[i] != 7) {
                i++;
            }
            if (i < n) {
                if (i == 0) {
                    mult = mult * vet[n - 1];
                } else {
                    mult = mult * vet[i - 1];
                }
            }
            i++;
        }
        return mult;
    }
}