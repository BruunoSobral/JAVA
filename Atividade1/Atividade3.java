package Atividade1;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	
		int ev, h, m, s, r;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o tempo do evento em segundos: ");
		ev=ler.nextInt();
		h=ev/3600;
		r=ev%3600;
		m=r/60;
		s=r%60;
		System.out.println("O tempo de duração é " +h+ " ,horas " +m+ " ,minutos e " +s+ " segundos.");
		ler.close();
		
	}

}
