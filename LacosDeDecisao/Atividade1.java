/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior
 */
package Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Informe o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.print("Informe o primeiro n�mero: ");
		n2 = ler.nextInt();
		System.out.print("Informe o primeiro n�mero: ");
		n3 = ler.nextInt();
		
		if((n1 > n2) && (n1 > n3)) {
			System.out.println("O primeiro n�mero � o maior.");
		}
		if((n2 > n1) && (n2 > n3)) {
			System.out.println("O segundo n�mero � o maior.");
		}
		if((n3 > n1) && (n3 > n2)) {
			System.out.println("O terceiro n�mero � o maior.");
		}
		else {
			System.out.println("Algum n�mero digitado foi igual.2");
		}

	}

}
