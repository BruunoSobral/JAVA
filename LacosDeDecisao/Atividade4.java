/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. 
 * Se for par, exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
package Atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.println("Entre com um n�mero inteiro: ");
		a = ler.nextInt();
		
		if((a % 2) == 0)
			System.out.println("O n�mero inserido � par! E a Raiz quadrada �: " +Math.sqrt(a));
		else
			System.out.println("O n�mero inserido � �mpar! E elevado ao quadrado d�: "+ Math.pow(a, 2));		
		
	}

}
