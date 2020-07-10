import java.util.Scanner;

/*Problema D
Faça um programa que receba n palavras
e mostre-as em ordem crescente de tamanho.
Caso haja mais de uma palavra com o mesmo
comprimento, mostre a que apareceu
primeiro antes.*/

public class ProblemaD {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String palavra;
	    int i = 0, n, j;
	    n = scan.nextInt();
	    String vet[] = new String[n];
		while (i < n) {
		    palavra = scan.next();
		    j = i;
		    while (j > 0 && palavra.length() < vet[j - 1].length()) {
		        vet[j] = vet[j - 1];
		        j--;
		    }
		    vet[j] = palavra;
		    i++;
		}
		i = 0;
		while (i < n) {
		    System.out.println(vet[i]);
		    i++;
		}
	}
}
