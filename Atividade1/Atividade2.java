package Atividade1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {		
		int anos, meses, dias, resp, sob;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Coloque a sua idade em dias: ");
		resp=ler.nextInt();
		anos=resp/365;
		sob=resp%365;
		meses=sob/12;
		dias=sob%30;
		
		System.out.println("A sua idade é: "+anos+ " anos " +meses+ " meses e "+dias+ " dias.");
		ler.close();

	}

}
