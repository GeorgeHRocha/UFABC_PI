import java.util.Scanner;

/*Problema E 
Faça um programa que receba várias palavras
e mostre a mais comprida delas.
Caso haja mais de uma palavra com o
comprimento da mais comprida, mostre a
primeira que apareceu.

Não use a “função” length().*/

public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String palavra, maior = "";
		while (scan.hasNext()) {
		    palavra = scan.next();
		    if (tamanho(palavra) > tamanho(maior)) {
		        maior = palavra;
		    }
		}
		System.out.println(maior);
	}
	public static int tamanho (String a) {
	    int i = 0;
	    while (a.substring(0, i) != a) {
	        i++;
	    }
	    return i;
	}
}
