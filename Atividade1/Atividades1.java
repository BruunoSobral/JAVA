package Atividade1;

import java.util.Scanner;

public class Atividades1 {

	public static void main(String[] args) 
	{
		
	Scanner ler = new Scanner(System.in);
	int anos, dias, meses, res;
	
	
	System.out.println("Digite a sua idade :");
	anos=ler.nextInt();
	System.out.println("Digite quantos meses você tem: ");
	meses=ler.nextInt();
	System.out.println("Digite quantos dias você tem: ");
	dias=ler.nextInt();
	res=anos*365+meses*30+dias;
	System.out.println(res);
	ler.close();
	}

}
