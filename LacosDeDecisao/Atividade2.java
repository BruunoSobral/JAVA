/*
 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
package Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Informe o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Informe o terceiro n�mero: ");
		c = ler.nextInt();
		
		if(a < b){
			if(b < c) {
				System.out.println("O ordem crescente �: "+a+" , "+b+" e "+c);
			}
			else if(a < c) {
				System.out.println("O ordem crescente �: "+a+" , "+c+" e "+b);	
			}
			else {
				System.out.println("O ordem crescente �: "+c+" , "+a+" e "+b);
			}
		}
		else if(b < c) {
			if(a < c) {
				System.out.println("O ordem crescente �: "+b+" , "+a+" e "+c);
			}
			else {
				System.out.println("O ordem crescente �: "+b+" , "+c+" e "+a);
			}
			}
		else {
			System.out.println("O ordem crescente �: "+c+" , "+b+" e "+a);
		}
		
	}

}
