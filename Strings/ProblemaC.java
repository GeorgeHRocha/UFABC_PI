import java.util.Scanner;

/*Problema C
Faça um programa que receba várias palavras
e mostre-as ao contrário.*/

public class ProblemaC {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String palavra;
	    int i, n;
		while (scan.hasNext()) {
		    palavra = scan.next();
		    i = 0;
		    n = palavra.length();
		    while (i < n) {
		        System.out.print(palavra.charAt(n - 1 - i));
		        i++;
		    }
		    System.out.println();
		}
	}
}
