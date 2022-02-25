package Atividade1;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		double a, b, c, d, e, f, x, y;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com os valores de A, B, C, D, E e F: ");
		a=ler.nextDouble();
		b=ler.nextDouble();
		c=ler.nextDouble();
		d=ler.nextDouble();
		e=ler.nextDouble();
		f=ler.nextDouble();
		
		x=(c*e*f)/(a*b*d);
		y=(a*f*d)/(a*b*d);
		System.out.println("Os valores de X e Y respectivamente são: " +x+ "e " +y);
		ler.close();
				
	}

}
