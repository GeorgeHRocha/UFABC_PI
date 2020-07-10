import java.util.Scanner;

/*Problema A 
Faça um programa que receba várias palavras
e mostre a mais comprida delas.
Caso haja mais de uma palavra com o
comprimento da mais comprida, mostre a
primeira que apareceu.*/

public class ProblemaA {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String palavra, maior = "";
		while (scan.hasNext()) {
		    palavra = scan.next();
		    if (palavra.length() > maior.length()) {
		        maior = palavra;
		    }
		}
		System.out.println(maior);
	}
}
