/*
 * Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. 
 * Se for par, exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
package Atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.println("Entre com um número inteiro: ");
		a = ler.nextInt();
		
		if((a % 2) == 0)
			System.out.println("O número inserido é par! E a Raiz quadrada é: " +Math.sqrt(a));
		else
			System.out.println("O número inserido é ímpar! E elevado ao quadrado dá: "+ Math.pow(a, 2));		
		
	}

}
