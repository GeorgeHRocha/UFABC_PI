import java.util.Scanner;

/*Problema B
Faça um programa que receba várias palavras
e mostre-as com um espaço em branco entre
as letras.*/

public class ProblemaB {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String palavra;
	    int i, n;
		while (scan.hasNext()) {
		    palavra = scan.next();
		    i = 0;
		    n = palavra.length();
		    while (i < n) {
		        System.out.print(palavra.charAt(i) + (i + 1 < n ? " " : "\n"));
		        i++;
		    }
		}
	}
}
