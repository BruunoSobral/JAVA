/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */
package LacosDeRepeti��o;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		float media = 0, cont = 0;
		
		System.out.println("Entre com um n�mero inteiro: ");
		num = ler.nextInt();
		if(num %3==0 && num !=0) {
			soma = soma + num;
			cont++;
		}
		while(num!=0) {
			System.out.println("Digite um n�mero inteiro: ");
			num = ler.nextInt();
			if(num%3==0 && num!=0) {
				soma = soma + num;
				cont++;
			}
		}
		media = soma/cont;
		System.out.println("A resultado �: "+ media);
		System.out.println("\n\n");
	}

}
