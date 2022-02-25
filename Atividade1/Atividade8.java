package Atividade1;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		double cf, dist, impo, cc;
		Scanner ler = new Scanner(System.in);
		System.out.println("Coloque o valor de Fábrica do veículo: ");
		cf=ler.nextDouble();
		dist=cf*0.28;
		impo=cf*0.45;
		cc=cf+dist+impo;
		System.out.println("O valor de venda do veículo é: " +cc);
		ler.close();

	}

}
