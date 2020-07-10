import java.util.Scanner;

/*Problema F
Faça um programa que receba n palavras
e mostre-as em ordem crescente de tamanho.
Caso haja mais de uma palavra com o mesmo
comprimento, mostre a que apareceu
primeiro antes.

Não use a “função” length().*/

public class ProgramaF {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int i = 0, n;
	    n = scan.nextInt();
	    String vet[] = new String[n];
		while (i < n) {
		    vet[i] = scan.next();
		    ordenaUltimo(vet, i);
		    i++;
		}
		mostrar(vet, n);
	}
	public static void ordenaUltimo(String vet[], int posUltimo) {
	    String aux;
	    int j;
	    aux = vet[posUltimo];
        j = posUltimo;
        while (j > 0 && tamanho(aux) < tamanho(vet[j - 1])) {
            vet[j] = vet[j - 1];
            j--;
        }
        vet[j] = aux;
	}
	public static int tamanho (String a) {
	    int i = 0;
	    while (a.substring(0, i) != a) {
	        i++;
	    }
	    return i;
	}
	public static void mostrar(String vet[], int n) {
	    int i = 0;
	    while (i < n) {
		    System.out.println(vet[i]);
		    i++;
		}
	}
}
