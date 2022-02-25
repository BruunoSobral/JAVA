package Atividade1;

import java.util.Scanner;

public class Atividades5 {

	public static void main(String[] args) {
	
		int n1, n2, n3 ,m;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com a médias:");
		n1=ler.nextInt();
		n2=ler.nextInt();
		n3=ler.nextInt();
		n1=n1*2;
		n2=n2*3;
		n3=n3*5;
		m=(n1+n2+n3)/10;
		System.out.println("A média é: "+m);
		ler.close();
		
	}

}
