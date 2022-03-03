/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior
 */
package Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Informe o primeiro número: ");
		n1 = ler.nextInt();
		System.out.print("Informe o primeiro número: ");
		n2 = ler.nextInt();
		System.out.print("Informe o primeiro número: ");
		n3 = ler.nextInt();
		
		if((n1 > n2) && (n1 > n3)) {
			System.out.println("O primeiro número é o maior.");
		}
		if((n2 > n1) && (n2 > n3)) {
			System.out.println("O segundo número é o maior.");
		}
		if((n3 > n1) && (n3 > n2)) {
			System.out.println("O terceiro número é o maior.");
		}
		else {
			System.out.println("Algum número digitado foi igual.2");
		}

	}

}
