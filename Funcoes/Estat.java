import java.util.Scanner;
public class Estat {
	static Scanner scan = new Scanner(System.in);
    public static void main (String[] args) { 
        int n, i = 0;
        n = scan.nextInt();
        int vet[] = new int[n];
        lerVetor(vet, n);
        System.out.printf("%.2f\n", media(n, vet));
        System.out.printf("%.2f\n", desvPadrao(n, vet, media(n, vet)));
        ordena(n, vet);
        System.out.printf("%.2f\n", mediana(n, vet));
        System.out.println(min(n, vet));
        System.out.println(max(n, vet));
    }
	public static void lerVetor(int vet[], int n) {
		int i = 0;
		while(i < n) {
            vet[i] = scan.nextInt();
            i++;
        }
	}
    public static double media (int n, int vet[]) {
        int i = 0;
        double md = 0;
        while(i < n) {
            md = md + vet[i];
            i++;
        }
        md = md / n;
        return md;
    }
    public static double desvPadrao (int n, int vet[], double media) {
        int i = 0;
        double soma = 0, desv = 0;
        while(i < n) {
            soma = soma + Math.pow(vet[i] - media, 2);
            i++;
        }
        desv = Math.sqrt(soma / (n - 1));
        return desv;
    }
    public static void ordena (int n, int vet[]) {
        int i = 0, j = 1, aux;
        while (i + 1 < n) {
            while(j < n) {
                if(vet[j] < vet[i]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
    }
    public static int mediana (int n, int vet[]) {
        int med;
        if (n % 2 != 0) {
            med = vet[n / 2];
        } else {
            med = (vet[n / 2] + vet[(n / 2) + 1]) / 2;
        }
        return med;
    }
    public static int min (int n, int vet[]) {
        int i = 0;
        int menor = vet[i];
        i = 1;
        while(i < n) {
            if (vet[i] < menor) {
                menor = vet[i];
            }
            i++;
        }
        return menor;
    }
    public static int max (int n, int vet[]) {
        int i = 0;
        int maior = vet[i];
        i = 1;
        while(i < n) {
            if (vet[i] > maior) {
                maior = vet[i];
            }
            i++;
        }
        return maior;
    }
}