package Atividade1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		double a, b, c, r, s, d;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Coloque o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Coloque o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Coloque o valor de C: ");
		c = ler.nextDouble();
		r= Math.pow (a+b,2);
		s= Math.pow(b+c,2);
		d=(r+s)/2;
		System.out.println("O resultado é: " +d);
		ler.close();

	}

}
