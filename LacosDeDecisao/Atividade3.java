/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
 */

package Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		System.out.println("Entre com a sua idade: ");
		a = ler.nextInt();
		
		if((a >= 10) && (a <=14)) 
		{
			System.out.println("Você se encontra na categoria infantil.");
		}
		
		else if((a >= 15) && (a <= 17))
		{
			System.out.println("Você se encontra na categoria juvenil.");
		}
		
		else if((a >= 18) && (a <= 25))
		{
			System.out.println("Você se encontra na categoria adulta.");
		}
		
		else {
			System.out.println("Você não se encontra em nenhuma categoria.");	
		}
	
		
	}

}
