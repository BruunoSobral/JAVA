/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. 
No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
package LacosDeRepeti��o;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, soma = 0;
		
		do {
			System.out.println("Insira um n�mero inteiro: ");
			a = ler.nextInt();
			if(a != 0) {
				soma = soma + a;
			}
		}
		while(a > 0);
		System.out.println("A soma dos n�meros digitados �:" +soma);

	}

}
