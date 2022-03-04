/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. 
No final, mostre a soma dos números digitados.(DO...WHILE)
 */
package LacosDeRepetição;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, soma = 0;
		
		do {
			System.out.println("Insira um número inteiro: ");
			a = ler.nextInt();
			if(a != 0) {
				soma = soma + a;
			}
		}
		while(a > 0);
		System.out.println("A soma dos números digitados é:" +soma);

	}

}
