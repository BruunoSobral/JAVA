/*
 * 2- Faça um programa que entre com três números e coloque em ordem crescente.
 */
package Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Informe o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Informe o segundo número: ");
		b = ler.nextInt();
		System.out.println("Informe o terceiro número: ");
		c = ler.nextInt();
		
		if(a < b){
			if(b < c) {
				System.out.println("O ordem crescente é: "+a+" , "+b+" e "+c);
			}
			else if(a < c) {
				System.out.println("O ordem crescente é: "+a+" , "+c+" e "+b);	
			}
			else {
				System.out.println("O ordem crescente é: "+c+" , "+a+" e "+b);
			}
		}
		else if(b < c) {
			if(a < c) {
				System.out.println("O ordem crescente é: "+b+" , "+a+" e "+c);
			}
			else {
				System.out.println("O ordem crescente é: "+b+" , "+c+" e "+a);
			}
			}
		else {
			System.out.println("O ordem crescente é: "+c+" , "+b+" e "+a);
		}
		
	}

}
